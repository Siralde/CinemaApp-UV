package ticketcine.Modelo;

import ticketcine.Controlador.Gerente;
import java.util.ArrayList;
import java.util.Date;
import ticketcine.Controlador.DetallesCine;

public class Cine {

    //Atributos
    private String nombre;
    private String direccion;
    private String tlf;
    private int n_salas;
    private String cp;
    private String poblacion;
    private Provincia provincia;
    private Sala sala;
    // Relaciones
    private ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    private ArrayList<Pelicula> peliculasCine = new ArrayList<Pelicula>();
    private ArrayList<Pase> pases = new ArrayList<Pase>();
    private ArrayList<Sala> salas = new ArrayList<Sala>();


    public Cine(String _nombre, String _direccion, String cp, String poblacion, String _tlf, int _n_salas, Provincia provincia) {
        this.nombre = _nombre;
        this.direccion = _direccion;
        this.tlf = _tlf;
        this.n_salas = _n_salas;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public ArrayList<Pase> consultarPases(Pelicula _pelicula) {

        ArrayList<Pase> paseDisponibles = new ArrayList<Pase>();

        for (Pase pase : pases) {
            if (pase.comprobarDisponibilidad(_pelicula)) {
                paseDisponibles.add(pase);
            }
        }

        return paseDisponibles;
    }

    public String toString() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTlfn() {
        return tlf;
    }

    public String getCP() {
        return cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia.toString();
    }

    public void setSala(Sala _sala) {
        salas.add(_sala);
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void registrarPelicula(Pelicula _pelicula) {
        peliculasCine.add(_pelicula);
    }
    
    public void eliminarPelicula(Pelicula _pelicula){
        peliculasCine.remove(_pelicula);
    }

    public void salaSeleccionada(Sala _sala) {
        sala = _sala;
    }

    public boolean consultarListaCine(Pelicula pelicula) {
        boolean añadir = true;
        int i = 0;

        for (Pelicula peliculaCine : peliculasCine) 
        {
            if (peliculaCine == pelicula)
            {
                añadir = false;
            }
        }
        return añadir;
    }

    public ArrayList<Sala> consultarSalasDisponibles(Date _fecha, Object _hora) {
        ArrayList<Sala> salasDisp = new ArrayList<Sala>(salas);

        for (Sala sala : salas) {
            if (sala.comprobarDisponibilidad(_fecha, _hora)) {
                salasDisp.remove(sala);
            }
        }
        return salasDisp;
    }

    public Pase registrarPase(Date _fecha, Object _hora, Sala _sala, Pelicula peliAct) {
        
        // El ultimo atributo es para que el estado del pase sea programado
        Pase paseCine = new Pase(_fecha, _hora, (float) 12, this, _sala, peliAct, "PROGRAMADO");

        _sala.registrarPase(paseCine);

        pases.add(paseCine);
       
        return paseCine;
    }

    public ArrayList getPases() {
        return this.pases;
    }

    public ArrayList obtenerPeliculas() {
        return this.peliculasCine;
    }

    public void addPeliculas(Pelicula p) {
        this.peliculasCine.add(p);
    }

    public DetallesCine consultarDetallesCine() {
        DetallesCine detalles = new DetallesCine(this.direccion,this.tlf,this.nombre,this.cp,this.poblacion);
        return detalles;
    }

    void addPase(Pase pase1) {
        this.pases.add(pase1);
    }

    public void eliminarPase(Pase pase) {
        this.pases.remove(pase);
    }
}
