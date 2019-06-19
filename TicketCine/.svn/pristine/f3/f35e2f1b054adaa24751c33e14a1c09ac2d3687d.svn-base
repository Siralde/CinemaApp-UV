package ticketcine.Modelo;

import java.util.ArrayList;
import ticketcine.Modelo.Pase;
import java.util.Date;
import ticketcine.Modelo.Cine;

public class Sala {
    // Atributos

    private int id_sala;
    private int capacidad; //Cantidad de asintos en una sala
    protected Cine cine;
    private ArrayList<Pase> pases = new ArrayList<Pase>();

    public Sala(int _n_sala, int capacidad) {
        this.id_sala = _n_sala;
        this.capacidad = capacidad;
    }

    public String toString() {
        return Integer.toString(id_sala);
    }

    public String getSala() {
        return Integer.toString(id_sala);
    }

    public void registrarPase(Pase paseNuevo) {
        pases.add(paseNuevo);
    }

    public boolean comprobarDisponibilidad(Date _fecha, Object _hora) {
        boolean ocupado = false;
        int i = 0, hh1, mm1, htotal;

        String hora = (String) _hora;
        String hh = hora.substring(0, 2);
        String mm = hora.substring(3, 5);
        hh1 = Integer.parseInt(hh);
        mm1 = Integer.parseInt(mm);
        htotal = (hh1 * 60) + mm1;

        while (i < pases.size() && !ocupado) {

            Pase p = pases.get(i);

            String hora2 = (String) p.getHora();
            String hh2 = hora2.substring(0, 2);
            String mm2 = hora2.substring(3, 5);
            int hh12 = Integer.parseInt(hh2);
            int mm12 = Integer.parseInt(mm2);
            int h2total = (hh12 * 60) + mm12;

            int diferencia = Math.abs(htotal - h2total);
            
            if (p.getFecha().compareTo(_fecha) == 0 || diferencia <= 180) 
                ocupado = true;

            i++;
        }

        return ocupado;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void eliminarPase(Pase pase) {
        this.pases.remove(pase);
    }
}
