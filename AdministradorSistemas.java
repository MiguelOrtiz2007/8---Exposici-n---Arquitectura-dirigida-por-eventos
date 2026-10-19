/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class AdministradorSistemas extends SoporteTecnico {

    public AdministradorSistemas(SoporteTecnico siguiente) {
        super(siguiente);
    }

    @Override
    public void atender(Solicitud solicitud) {
        if (solicitud.getTipo() == TipoProblema.Infrastructura) {
            System.out.println("Problema resuelto por el administrador");
        } else if (siguiente != null) {
            System.out.println("Sin solucion");
        }
    }
}