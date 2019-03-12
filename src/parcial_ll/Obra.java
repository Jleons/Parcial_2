/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_ll;

/**
 *
 * @author jleons
 */
public class Obra {
private String  nombre; 
private String descripcion; 
private String estilo; 
private double valor; 

    public Obra(String nombre, String descripcion, String estilo, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

     




}
