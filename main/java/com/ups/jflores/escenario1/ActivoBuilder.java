/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.escenario1;

/**
 *
 * @author JuanFlores
 */
public abstract class  ActivoBuilder {
    
    protected Activo activo;
    protected ActivoComputadora computadora;
    protected ActivoMesa mesa;
    protected ActivoSilla silla;

    public Activo getActivo() {
        return activo;
    }
    
    public ActivoBuilder computadora(){
        this.computadora.setDepartamento_asignado("departamento");
        this.computadora.setMarca("marca");
        this.computadora.setModelo("modelo");
        this.computadora.setRam("ram");
        this.computadora.setTipo("tipo");
        return this;
    }

    public abstract void setcodigo();

    public abstract void setnombre();

    public abstract void setprecio();


    
}
