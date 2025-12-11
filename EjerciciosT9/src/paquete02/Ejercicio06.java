/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String[] nombres = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        int[] tazas = new int[3]; // {0, 0, 0}
        
        int opcion;
        int cantidad;
        int indice;
        
        double totalPedido;
        double totalGeneral = 0;
        double totalTipo;
        
        String reporte = "";
        
        reporte = String.format("%sEl usuario ha comprado:\n", reporte);
        
        boolean bandera = true;

        while (bandera) {
            System.out.printf("MENÚ DE CAFÉS\n"
                + "1) Café tradicional\n"
                + "2) Café francés\n"
                + "3) Café alemán\n"
                + "4) Terminar compra\n"
                    + "Seleccione una opción:\n");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                indice = opcion - 1;
                System.out.printf("¿Cuántas tazas de %s? ", nombres[indice]);
                cantidad = entrada.nextInt();

                totalPedido = cantidad * precios[indice];
                System.out.printf("Total de este pedido: $%.2f%n", totalPedido);

                // acumular tazas
                tazas[indice] = tazas[indice] + cantidad;

            } else if (opcion == 4) {
                bandera = false;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        System.out.println("\nEl usuario ha comprado:");

        for (int i = 0; i < nombres.length; i++) {
            if (tazas[i] > 0) {
                totalTipo = tazas[i] * precios[i];
                totalGeneral = totalGeneral + totalTipo;
                System.out.printf("  %s (%d t), valor a cancelar $%.2f%n",
                        nombres[i], tazas[i], totalTipo);
            }
        }
        System.out.printf("Total general a pagar: $%.2f\n", totalGeneral);

    }

}
