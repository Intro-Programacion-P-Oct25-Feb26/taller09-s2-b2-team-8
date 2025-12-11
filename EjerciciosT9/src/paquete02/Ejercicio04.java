/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};

        String[] promediosCualitativos = new String[7];
        double nota;
        String cualitativo;

        int valor= promedios.length;
        for (int i = 0; i < valor; i++) {

            nota = promedios[i];

            if (nota >= 0 && nota <= 5.9) {
                cualitativo = "Regular";
            } else {
                if (nota >= 6 && nota <= 8.9) {
                    cualitativo = "Bueno";
                } else {
                    cualitativo = "Sobresaliente"; 
                }
            }

            promediosCualitativos[i] = cualitativo;
        }

        System.out.println("Reporte de promedios de estudiantes:\n");
        int valor2= estudiantes.length;
        for (int i = 0; i < valor2; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s\n",
                    estudiantes[i],
                    promedios[i],
                    promediosCualitativos[i]);
        }
    }
}
