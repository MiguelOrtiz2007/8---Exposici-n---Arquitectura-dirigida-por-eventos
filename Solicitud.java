/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Solicitud {
    private TipoProblema tipo;
    private String descripcion;

    public Solicitud(TipoProblema tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public TipoProblema getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}