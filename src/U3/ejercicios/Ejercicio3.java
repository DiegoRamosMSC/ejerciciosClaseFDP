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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.println("\t\tPrograma que determina si usted es MAYOR de edad");
        System.out.println("Ingrese su edad: ");
        edad=lector.nextInt();
        
        System.out.println("\nSolucion de Israel");
        if (edad>=18) {
            System.out.println("Eres MAYOR de edad te voy a llevar al VIP");
        } else {
        System.out.println("Eres MENOR de edad");
         }
        
        System.out.println("\nSolucion de Yamir y Cristopher");
         if (edad<18) {
            System.out.println("Eres MENOR de edad");
        } else {
        System.out.println("Eres MAYOR de edad");
         }
         
        System.out.println("\nSolucion de Diego");
          if (edad>17) {
            System.out.println("Eres MAYOR de edad");
        } else {
        System.out.println("Eres MENOR de edad");
         }
     } 
 }
