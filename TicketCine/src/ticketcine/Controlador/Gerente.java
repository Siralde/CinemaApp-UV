package ticketcine.Controlador;

import ticketcine.Modelo.TicketCine;
import ticketcine.Modelo.*;
import java.util.ArrayList;
import java.util.Date;

public class Gerente extends UsuarioRegistrado {
    private ArrayList<Cine> cinesGerente = new ArrayList<Cine>();

    public Gerente(String nombre, String apellidos, String dni, String tlf, Date fnac, Provincia provincia, String email, String password, TicketCine ticketCine) {
        super(nombre, apellidos, dni, tlf, fnac, provincia, email, password, ticketCine);
    }

    public ArrayList consultarCinesGerente() {
        return this.getCinesGerentes();
    }
    
    public ArrayList getCinesGerentes()
    {
        return cinesGerente;
    }
        
    public ArrayList consultarPeliculasNuevas(Object cineAct) {
        
        this.setCineAct(cineAct);
	return ticketCine.consultarPelisNuevas( this.cineAct );
    }
    
    public ArrayList registrarPelicula(Object _pelicula) {
        this.setPeliAct(_pelicula);
        this.cineAct.registrarPelicula((Pelicula) _pelicula);
        return this.cineAct.getSalas();
    }
    
    //Botón atrás EstrenarPeliculas2 - EstrenarPeliculas1
    public void eliminarPelicula()
    {
        this.cineAct.eliminarPelicula((Pelicula) getPeliAct());
    }
    
    public ArrayList consultarSalasDisponibles(Object _fecha, Object _hora) {
        return this.cineAct.consultarSalasDisponibles((Date)_fecha, _hora);
    }

    public Object registrarPase(Object _fecha, Object _hora, Object _sala) {
        
        return this.cineAct.registrarPase((Date)_fecha, _hora, (Sala) _sala, (Pelicula) this.getPeliAct());
    }
    
    public void addCine(Object _cine) {
        cinesGerente.add((Cine)_cine);
    } 

    public void eliminarPase(ArrayList<Object> pasesAnadidos, ArrayList<Object> salasElegidas) {

        for(Object sala : salasElegidas)
        {
            for(Object pase : pasesAnadidos)
            {
                ((Sala)sala).eliminarPase((Pase) pase);
            }
        }
            
        for(Object pase : pasesAnadidos)
        {
            ((Cine) this.getCineAct()).eliminarPase((Pase) pase);
        }
      
    }
}
