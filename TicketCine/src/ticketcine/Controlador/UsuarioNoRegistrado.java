/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcine.Controlador;

import java.util.ArrayList;
import ticketcine.Modelo.Cine;
import ticketcine.Modelo.Pelicula;
import ticketcine.Modelo.Provincia;
import ticketcine.Modelo.TicketCine;

/**
 *
 * @author ajgs
 */
public class UsuarioNoRegistrado {

    protected Provincia provinciaAct;
    protected Cine cineAct;
    protected Pelicula peliAct;
    private TicketCine ticketCine;
    
 
    UsuarioNoRegistrado(TicketCine ticketCine) {
        this.ticketCine = ticketCine;
    }

    public Provincia getProvinciaAct() {
        return provinciaAct;
    }

    public void setProvinciaAct(Provincia provinciaAct) {
        this.provinciaAct = provinciaAct;
    }
    
    public Object getCineAct() {
        return cineAct;
    }

    public void setCineAct(Object cineAct) {
        this.cineAct = (Cine) cineAct;
    }

    public Object getPeliAct() {
        return peliAct;
    }

    public void setPeliAct(Object peliAct) {
        this.peliAct = (Pelicula) peliAct;
    }

    public TicketCine getTicketCine() {
        return ticketCine;
    }

    public void setTicketCine(TicketCine ticketCine) {
        this.ticketCine = ticketCine;
    }

    public ArrayList consultarProvincias() {
       return ticketCine.consultarProvincias();
    }

    public ArrayList consultarCines(Object provincia) {
        return ((Provincia) provincia).consultarCines();
    }

    public DetallesCine consultarDetallesCine(Object _cine) {
        return  ((Cine) _cine).consultarDetallesCine();
    }

    public ArrayList consultarCartelera(Object _cine) {
        return ((Cine) _cine).obtenerPeliculas();
    }

    public DetallesPelicula consultarDetallesPelicula(Object _pelicula) {
        return ((Pelicula) _pelicula).consultarDetallesPelicula();
    }
}
