/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class TecnicoBasico extends SoporteTecnico {

    public TecnicoBasico(SoporteTecnico siguiente) {
        super(siguiente);
    }

    @Override
    public void atender(Solicitud solicitud) {
        if (solicitud.getTipo() == TipoProblema.Basico) {
            System.out.println("Problema resuelto por el técnico básico");
        } else if (siguiente != null) {
            siguiente.atender(solicitud);
        }
    }
}
