/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_ll;

import java.util.ArrayList;

/**
 *
 * @author jleons
 */
public class Compra {
  
    private Coleccion coleccion;
    private ArrayList<Cliente> cliente;
    private ArrayList<Artista> artistas;

    public Compra(Coleccion coleccion, ArrayList<Cliente> cliente, ArrayList<Artista> artistas) {
        this.coleccion = coleccion;
        this.cliente = cliente;
        this.artistas = artistas;
    }
    
    public double ValorTotal(){
        
        for(int i=0; i<coleccion.getObras().size(); i++){
            valor_total+=coleccion.getObras().;
        }
        return valor_total;
    }
}
