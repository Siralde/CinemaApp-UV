package ticketcine.Modelo;

import ticketcine.Controlador.Cliente;

public class PaseProgramado extends EstadoPase {
    /**
     * Cantidad de asientos disponibles en una sala
     */
    private int asientos_disponibles;

    public PaseProgramado(Pase pase) {
       super(pase);
       this.asientos_disponibles = this.pase.getCapacidadSala();
    }

    /**
     * Va a comprobar que el numero de entradas introducido por el usuario 
     * no sea mayor al numero que hay de asientos disponibles en la sala
     * 
     * @param _n_entradas
     * 
     * @retval true si el numero de entradas del cliente es menor que el numero
     *              de entradas disponibles
     * @retval false si el numero de entradas del cliente es mayor al numero 
     *              de entradas disponibles 
     */
    public float comprobarNumeroEntradas(int _n_entradas) {
        float importe = 0;

        if(_n_entradas <= asientos_disponibles)
        {
            importe =  _n_entradas * this.pase.getPrecio();
        }
        else if(_n_entradas > asientos_disponibles)
        {
            importe = asientos_disponibles - _n_entradas;
        }
        else if(asientos_disponibles == 0)
        {
            importe = 0;
        }

        return importe;
    }
    /**
     * 
     * Comprueba los que la pelicula de un pase sea igual a la pelicula 
     * ingresada por el cliente
     * 
     * @param _pelicula
     * 
     * @retval true si la pelicula del pase es la misma que quiere el cliente
     * @retval false si la pelicula del pase no es igual a la que quiere el cliente
     */
    public boolean comprobarDisponibilidad(Pelicula _pelicula) {
        return this.pase.comprobarPelicula(_pelicula);
    }
        
        
    /**
     * 
     * Crea una compra nueva y las anade a los arraylist de cliente y pase
     * 
     * @param importe importe de la compra
     * @param n_entradas numero de entradas de la compra
     * @param cliente cliente que realizo la compra
     * 
     * @retval false porque es el estado por defecto
     */
    public boolean confirmarCompra(float importe, int n_entradas, Cliente cliente) {
        boolean confirmada= true;
        Compra nuevaCompra = new Compra(this.pase, cliente, importe, n_entradas);

        if( cliente.addCompra(nuevaCompra) == false )
        { 
            confirmada = false;
        }
        else
        { 
            boolean f = this.pase.addCompra(nuevaCompra);
            
            nuevaCompra.setPase(this.pase);
            
        }
        return confirmada;
    }   
                
}