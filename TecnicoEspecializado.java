/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class TecnicoEspecializado extends SoporteTecnico {

    public TecnicoEspecializado(SoporteTecnico siguiente) {
        super(siguiente);
    }

    @Override
    public void atender(Solicitud solicitud) {
        if (solicitud.getTipo() == TipoProblema.Software) {
            System.out.println("Problema resuelto por el técnico especializado");
        } else if (siguiente != null) {
            siguiente.atender(solicitud);
        }
    }
}
