/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcine.Modelo;

/**
 *
 * @author Juanxo
 */
public class Critica {
    
    private String comentario;
    
    public Critica(String comentario)
    {
        this.comentario = comentario;
    }
    
    
    public String toString(){
        return comentario;
    }
    
    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }
    
    public String getComentario()
    {
        return comentario;
    }
}
