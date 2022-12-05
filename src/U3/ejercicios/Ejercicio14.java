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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numMaterias, i=1;
        double calificacion, suma=0, promedio;
        
        System.out.println("Programa que calcula el promedio de x numero de materias");
        System.out.println("Ingrese el numero de materias que lleva: ");
        numMaterias=entrada.nextInt();
        
        while (i<=numMaterias) {            
            System.out.println("Ingrese la Calificacion de la materia "+i+":");
            calificacion=entrada.nextDouble();
            suma=suma+calificacion;
            i++;
        }
        
        promedio=suma/numMaterias;
        System.out.println("El promedio de calificacion es: "+promedio);
    }
    
}
