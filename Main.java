/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SoporteTecnico administrador = new AdministradorSistemas(null);
        SoporteTecnico especializado = new TecnicoEspecializado(administrador);
        SoporteTecnico basico = new TecnicoBasico(especializado);

        String continuar;
        do {
            System.out.println("\n=== NUEVA SOLICITUD DE SOPORTE ===");
            TipoProblema tipo = leerTipo(sc);

            System.out.print("Descripcion del problema: ");
            String descripcion = sc.nextLine().trim();

            Solicitud solicitud = new Solicitud(tipo, descripcion);

            basico.atender(solicitud);

            System.out.print("\n¿Registrar otra solicitud? (s/n): ");
            continuar = sc.nextLine().trim();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Fin del programa.");
        sc.close();
    }

    private static TipoProblema leerTipo(Scanner sc) {
        while (true) {
            System.out.println("Tipo de problema:");
            System.out.println("1. Basico");
            System.out.println("2. Software");
            System.out.println("3. Infraestructura");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    return TipoProblema.Basico;
                case "2":
                    return TipoProblema.Software;
                case "3":
                    return TipoProblema.Infrastructura;
                default:
                    System.out.println("Opción inválida, intente de nuevo.\n");
            }
        }
    }
}