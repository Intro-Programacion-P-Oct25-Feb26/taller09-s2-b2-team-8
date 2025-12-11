/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ventas =  new int [5] ;
        int i;
        String[] dias = new String[5];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";

        int valor1= ventas.length;
        for (i = 0; i < valor1; i = i + 1) {
            System.out.printf("Ingrese ventas del dia %s:\n", dias[i]);
            ventas[i] = entrada.nextInt();
        }

        System.out.println("\nReporte de ventas del vendedor en total:\n");
        for (i = 0; i < valor1; i = i + 1) {
            System.out.printf("%s $%d\n", dias[i], ventas[i]);
        }
    }
}
