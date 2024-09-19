/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.escenario1;

/**
 *
 * @author JuanFlores
 */
public class ActivoDirector {
    
     private ActivoBuilder builder;
     
    
      

    public void setBuilder(ActivoBuilder builder) {
        this.builder = builder;
    }

    public ActivoBuilder getBuilder() {
        return builder;
    }

    public void construirActivo() {
        this.builder.setcodigo();
        this.builder.setnombre();
        this.builder.setprecio();
    }
    
     public void construirActivoComputadora() {
        this.builder.setnombre();
        this.builder.setprecio();
    }
    
    
}
