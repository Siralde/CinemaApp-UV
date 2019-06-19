package ticketcine.Controlador;

import ticketcine.Modelo.TicketCine;
import java.util.ArrayList;
import java.util.Date;
import ticketcine.Modelo.*;


public class Cliente extends UsuarioRegistrado {
    private ArrayList<Compra> compras;
    private Pase pase_a_comprar;
    private int num_entradas_a_comprar;
    private float precio_pase_a_comprar;
    

    public Cliente(String nombre, String apellidos, String dni, String tlf, Date fnac, Provincia provincia, String email, String password, TicketCine ticketCine) {
        super(nombre, apellidos, dni, tlf, fnac, provincia, email, password, ticketCine);
        this.compras = new ArrayList<Compra>();
    }

    
    public DetallesPase consultarDetallesPase(Object pase)
    {
        return ((Pase) pase).consultarDetallesPase();
    }
    
    /**
     * Consulta la lista de pases de un pelicula seleccionada
     * 
     * @param cineAct Cine elegido por el cliente
     * @param peliAct Pelicula elegida por el cliente
     * 
     * @return Lista de Pases disponibles
     */ 
    public ArrayList consultarPases(Object cineAct, Object peliAct)
    {
        return ( (Cine) cineAct).consultarPases( (Pelicula) peliAct );
    }

    
    public Pase getPaseComprar() {
        return pase_a_comprar;
    }

    public void setPaseComprar(Pase pase_a_comprar) {
        this.pase_a_comprar = pase_a_comprar;
    }

    public int getNumEntradasComprar() {
        return num_entradas_a_comprar;
    }

    public void setNumEntradasComprar(int num_entradas_a_comprar) {
        this.num_entradas_a_comprar = num_entradas_a_comprar;
    }

    public float getPrecioPaseComprar() {
        return precio_pase_a_comprar;
    }

    
    /*
    Este es el pase elegido por el cliente para realizar la compra
    Es utilizado en las funciones comprobarNumeroEntradas y ConfirmarCompra
     */
    public void setPrecioPaseComprar(float precio_pase_a_comprar) {
        this.precio_pase_a_comprar = precio_pase_a_comprar;
    }
    

    /**
    * Comprueba que el numero de entradas que quiere el cliente
    * es menos o igual al numero de entradas disponibles para el pase programado
    *
    * @param[in] _pase Pase seleccionado por el cliente
    * @param[in] _n_entradas Numero de entradas deseadas por el cliente
    *
    * @return precio de la compra
    */
    public float comprobarNumeroEntradas(Object _pase, int _n_entradas) {
        
        /* 
        * Este pase a comprar deberia llamarse pase y estar dentr de esta funcion o ser un atributo
        */
        pase_a_comprar = (Pase) _pase;
        num_entradas_a_comprar = _n_entradas;
        precio_pase_a_comprar = pase_a_comprar.comprobarNumeroEntradas(_n_entradas);
        
        return precio_pase_a_comprar;
    }

    /**
     * Realiza la compra de un o varios pases y lo guarda en el vector de compras
     *
     * @retval true si se pudo realizar la compra
     * @retval false si no se pudo realizar la compra
     */
    public boolean confirmarCompra() {
        boolean paypal = true, confirmada = false;
        
        if(paypal)
        {
            confirmada = pase_a_comprar.confirmarCompra(precio_pase_a_comprar, num_entradas_a_comprar, this);
        }
        
        return confirmada;
    }
    
    /**
     * 
     * Anade una compra nueva en el array list de compras
     * 
     * @param nuevaCompra cpmpra a anadir
     * 
     * @retval true si se pudo anadir la compra
     * @retval false si no se pudo anadir la compra
     */
    public boolean addCompra(Compra nuevaCompra) {
       return compras.add(nuevaCompra);
    }
    
    /**
     * 
     * Elimina la compra del ArrayList
     * 
     * @param compra Compra a eliminar
     * 
     */
    public void deleteCompra(Compra compra){
        compras.remove(compra);
    }
    
    
    public ArrayList consultarCompras()
    {
       return getCompras();
    }
    
    public void realizarCritica(int indice, String comentario)
    {
        Critica critica = new Critica(comentario);
        compras.get(indice).realizarCritica(critica);
    }
    
    public ArrayList getCompras()
    {
        return compras;
    }
    
    public DetallesPase consultarDetallesCompraPase(Object compra)
    {
        return this.consultarDetallesPase(((Compra) compra).getPase());
    }
    
    public DetallesCompra consultarDetallesCompra(Object compra)
    {
        return ((Compra) compra).consultarDetallesCompra();
    }
    
    public DetallesCine consultarDetallesCompraCine(Object compra)
    {
        Pase p = ((Compra) compra).getPase();
        return this.consultarDetallesCine(p.getCine());
    }
}