package ticketcine.Modelo;

import java.util.ArrayList;
import java.util.Date;
import ticketcine.Controlador.DetallesPelicula;

 public class Pelicula {

    private String titulo;
    private String genero;
    private String direccion;
    private String interpretes;
    private Date fecha_estreno;
    private int calificacion;
    private String sinopsis;
    private ArrayList<Critica> criticas = new ArrayList<Critica>();
    private ArrayList<Cine> cines = new ArrayList<Cine>();
    
    public Pelicula(String _titulo, String _genero, String _direccion, String _interpretes, Date _fecha_estreno, int _calificacion, String _sinopsis) {
        titulo = _titulo;
        genero = _genero;
        direccion = _direccion;
        interpretes = _interpretes;
        fecha_estreno = _fecha_estreno;
        calificacion = _calificacion;
        sinopsis = _sinopsis;
    }

    public boolean comprobarPeliculaCine(Cine _cine) {
        boolean pertenece = false;
        int i;
        System.out.println("comprobarPeliculaCine | Pelicula:  "+ _cine);
        System.out.println("Tamaño del Vector Cines | Pelicula:  "+ this.cines.size());
        
        i = 0;
        while(pertenece == false && i < this.cines.size() ) 
        {
            if (this.cines.get(i).equals(_cine)) 
            {
                pertenece = true;
            }
        }

        return pertenece;
    }
    
    public void addCine(Cine _cine){
        cines.add(_cine);
    }
            
    public String toString()
    {
        return titulo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
  
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public Date getFechaEstreno() {
        return fecha_estreno;
    }

    public void setFechaEstreno(Date fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
 
    public void realizarCritica(Critica critica)
    {
        this.criticas.add(critica);
    }

    public DetallesPelicula consultarDetallesPelicula() {
        DetallesPelicula detalles = new DetallesPelicula(this.titulo, this.genero, this.direccion, this.calificacion, this.sinopsis, this.interpretes, this.fecha_estreno, this.criticas.get(0));
        return detalles;
    }
}
