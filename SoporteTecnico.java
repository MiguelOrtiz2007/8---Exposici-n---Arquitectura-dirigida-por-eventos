/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


public abstract class SoporteTecnico {

    protected SoporteTecnico siguiente;

    public SoporteTecnico(SoporteTecnico siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void atender(Solicitud solicitud);
}