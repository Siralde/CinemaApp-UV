package ticketcine.Modelo;

import ticketcine.Controlador.Cliente;

public class EstadoPase {
    protected Pase pase;
        
    public EstadoPase(Pase pase) {
        this.pase = pase;
    }

    /**
     * 
     * Comprueba Disponibilidad de la pelicula para los pases programados
     * 
     * @param _pelicula Pelicula elegida por el cliente
     * 
     * @return  
     */
    public boolean comprobarDisponibilidad(Pelicula _pelicula) {
        return false;
    }

    /**
     * 
     * Comprueba si el numero de entradas que quiere el usuario 
     * es menor que el numero de asientos disponible para los pases programados
     * 
     * @param _n_entradas
     * 
     * @return 
     */
    public float comprobarNumeroEntradas(int _n_entradas) {
        return -1; // este metodo no tenia return (WILL)
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
    boolean confirmarCompra(float importe, int n_entradas, Cliente cliente) {
        return false;
    }

}