/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcine.Controlador;

/**
 *
 * @author Rulos
 */
public class DetallesCine {

    public String direccion;
    public String tlf;
    public String nombre;
    public String cp;
    public String poblacion;

    public DetallesCine(String direccion, String tlf, String nombre, String cp, String poblacion) {
        this.direccion = direccion;
        this.tlf = tlf;
        this.nombre = nombre;
        this.cp = cp;
        this.poblacion = poblacion;
    }
}
