/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.escenario1;

/**
 *
 * @author JuanFlores
 */
public class ActivoComputadora extends ActivoBuilder{
    
    String modelo;
    String ram;
    String tipo;
    String marca;
    String departamento_asignado;
    
    public ActivoComputadora() {

        super.activo = new Activo();
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDepartamento_asignado() {
        return departamento_asignado;
    }

    public void setDepartamento_asignado(String departamento_asignado) {
        this.departamento_asignado = departamento_asignado;
    }

    @Override
    public void setcodigo() {
        this.getActivo().setCodigo(0);
      }

    @Override
    public void setnombre() {
       this.getActivo().setNombre(modelo);
     }

    @Override
    public void setprecio() {
       this.getActivo().setPrecio(100);
    }

    
    
    
    
}
