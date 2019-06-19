/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcine.Controlador;

import ticketcine.Modelo.TicketCine;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class GestorTicketCine {

    private TicketCine ticketCine;
    public static XStream xstream = null;
    
   
    public GestorTicketCine() throws Exception{
     
        xstream = new XStream(new DomDriver());
        String xml_ticketCine = xstream.toXML(ticketCine);
        
        try 
        {
            FileInputStream file_input_xml = new FileInputStream(new File("src/TicketCine.xml"));
            ticketCine = (TicketCine) xstream.fromXML(file_input_xml);
            if (ticketCine==null) 
            {
               throw new Exception("Excepción no se encuentra el ticketCine ");
            }
        } 
        catch (FileNotFoundException e) 
        {
            //Se realiza la primera vez para tener un ejemplo de bibloteca en XML
            ticketCine = new TicketCine();
            ticketCine.cargarDatos();
            
            xml_ticketCine = xstream.toXML(ticketCine);
            FileWriter file_output_xml = new FileWriter(new File("src/TicketCine.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml_ticketCine);
            file_output_xml.close();
        } 
        catch (IOException e) 
        {
            throw new Exception("IOExcepción al cargar los datos" + e.getMessage());
        } 
        catch (Exception e) 
        {
            throw new Exception("Excepción al cargar los datos" + e.getMessage());
        }   
        
    }
    
    
    public UsuarioNoRegistrado iniciar() {
        return new UsuarioNoRegistrado(this.ticketCine);
    }
     
    public UsuarioRegistrado login(String _email, String _contrasena) {
       return ticketCine.login( _email, _contrasena);
    }
}
