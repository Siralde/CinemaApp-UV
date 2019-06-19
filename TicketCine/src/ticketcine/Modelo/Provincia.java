package ticketcine.Modelo;

import java.util.ArrayList;

public class Provincia {

    private String nombre;
    private TicketCine ticketCine;
    private ArrayList<Cine> cines = new ArrayList<Cine>();

    public Provincia(String nombre, TicketCine ticketCine) {
        this.nombre = nombre;
        this.ticketCine = ticketCine;
    }
    
    public void addCine(Cine cine)
    {
        this.cines.add(cine);
    }

    public ArrayList consultarCines() {
        return cines;
    }
    
    public String toString()
    {
        return nombre;
    }
}
