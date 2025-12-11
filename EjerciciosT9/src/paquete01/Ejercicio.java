/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i;               
        int numero;          
        int contador = 0;    

        System.out.println("¿Cuantas marcas desea ingresar?");
        numero = entrada.nextInt();
        entrada.nextLine(); 

        String[] marcas = new String[numero]; 
        String dato;
        String letra;

        while (contador < numero) {
            System.out.println("Ingrese una marca de vehículo:");
            dato = entrada.nextLine();

            letra = dato.substring(0, 1).toLowerCase();

            switch (letra) {
                case "a":
                case "c":
                case "t":
                    System.out.println(" Esa marca No se cuenta "
                            + "( Si inicia con A, C o T).");
                    break;

                default:
                    marcas[contador] = dato;
                    contador = contador + 1;    
                    System.out.println(" Marca registrada Correctamente.");
            }
        }

        System.out.println("\n Reporte final de marcas de autos ");
        int valor= marcas.length;
        for (i = 0; i < valor; i = i + 1) {   
            System.out.printf("Posicion %d: %s\n", i, marcas[i]);
        }
    }
}
