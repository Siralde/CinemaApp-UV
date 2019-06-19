package ticketcine.Modelo;

import ticketcine.Controlador.Cliente;
import java.util.Date;
import ticketcine.Controlador.DetallesCompra;

public class Compra {

    private Date fecha;
    private float precio;
    private int n_entradas;
    private Cliente cliente;
    private Pase pase;

    /**
     * Constructor de compra
     *
     * @param _pase pase de la pelicula
     * @param _cliente cliente que compro la pelicula
     * @param _importe precio del pase * numero de entradas
     * @param _n_entradas numero de entradas a comprar
     *
     */
    public Compra(Pase _pase, Cliente _cliente, float _importe, int _n_entradas) {
        this.fecha = new Date();
        this.pase = _pase;
        this.cliente = _cliente;
        this.precio = _importe;
        this.n_entradas = _n_entradas;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date _fecha) {
        this.fecha = _fecha;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float _precio) {
        this.precio = _precio;
    }

    public int getN_entradas() {
        return this.n_entradas;
    }

    public void setN_entradas(int _n_entradas) {
        this.n_entradas = _n_entradas;
    }

    public boolean setPase(Pase _pase) {
        this.pase = _pase;
        return true;
    }

    public Pase getPase() {
        return pase;
    }
    
    public String toString()
    {
        Pelicula p = pase.getPelicula();
        return p.getTitulo();
    }

    /**
     *
     * Realiza la compra de una sesion, comprobando que el pago si fue realizado
     * a traves de paypal
     *
     * @param _pase Pase elegido por el cliente
     * @param _n_entradas Numero de entradas deseadas por el cliente
     *
     * @retval true si se pudo realizar la compra
     * @retval false si no se pudo realizar la compra
     */
    public boolean realizarCompra(Pase _pase, int _n_entradas) {
        /*
            * Como implemento lo de PayPal
         */
        boolean paypal = true;

        if (paypal) {
            this.setFecha(_pase.getFecha());
            this.setPrecio(_pase.getPrecio());
            this.setN_entradas(_n_entradas);
            this.setPase(_pase);
        }

        return paypal;
    }

    public void realizarCritica(Critica comentario) {
        pase.realizarCritica(comentario);
    }
    
    public DetallesCompra consultarDetallesCompra()
    {
        DetallesCompra dc = new DetallesCompra(this.fecha, this.precio, this.n_entradas);
        return dc;
    }
}
