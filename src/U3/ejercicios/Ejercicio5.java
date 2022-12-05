/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\tPrograma que determina si un alumno esta REPROBADO O APROBADO");
        double calificacion;
        System.out.println("Ingrese su calificacion: ");
        calificacion=entrada.nextDouble();
        
        System.out.println("===Solucion 1===");
        if (calificacion>70)
            System.out.println("Estas Aprobado");
        if (calificacion<70)
            System.out.println("Estas Reprobado");
        
        System.out.println("===Solucion 2===");
        if (calificacion>=70)
            System.out.println("Estas Aprobado");
        if (calificacion<70)
            System.out.println("Estas Reprobado");
    }
}
