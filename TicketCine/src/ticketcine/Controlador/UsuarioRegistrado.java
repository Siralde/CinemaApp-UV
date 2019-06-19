package ticketcine.Controlador;

import ticketcine.Modelo.TicketCine;
import java.util.ArrayList;
import java.util.Date;
import ticketcine.Modelo.Cine;
import ticketcine.Modelo.Pelicula;
import ticketcine.Modelo.Provincia;

public class UsuarioRegistrado extends UsuarioNoRegistrado{

    private static int contadorid=0;
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private String dni;
    private String tlf;
    private Date fecha_nac;
    private Provincia provincia;
    private String email;
    private String password;
    protected TicketCine ticketCine;
    private ArrayList<Cine> cines = new ArrayList<Cine>();
    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    final int ERROR = -1;
    final int ENCONTRADO = 1;
    final int SEGUIR = 0;

    public UsuarioRegistrado(String nombre, String apellidos, String dni, String tlf, Date fnac, Provincia provincia, String email, String password, TicketCine ticketCine){
        super(ticketCine);
        this.id_usuario = this.contadorid;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tlf = tlf;
        this.fecha_nac = fnac;
        this.provincia = provincia;
        this.email = email;
        this.password = password;
        this.ticketCine = ticketCine;
        this.contadorid++;
    }
    
    public String toString() {
        return email;
    }

    public int validarUsuario(String email, String password) {
        int resultado;
    
        if(email.equals(this.email) && password.equals(this.password))
        {
            resultado = ENCONTRADO;
        }
        else if (email.equals(this.email) && !password.equals(this.password))
            resultado = ERROR;
        else 
            resultado = SEGUIR;
        
        return resultado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static int getContadorid() {
        return contadorid;
    }

    public static void setContadorid(int contadorid) {
        UsuarioRegistrado.contadorid = contadorid;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public TicketCine getTicketCine() {
        return ticketCine;
    }

    public void setTicketCine(TicketCine ticketCine) {
        this.ticketCine = ticketCine;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
