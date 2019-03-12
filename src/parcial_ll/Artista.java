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
public class Artista extends Usuario{
    private String curriculum;
    private String distinciones;
    private ArrayList<Obra> obras;

    public Artista(String curriculum, String distinciones, String apellido, String nombre) {
        super(apellido, nombre);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras= new ArrayList<>();
        
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public void setDistinciones(String distinciones) {
        this.distinciones = distinciones;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    
   

}
