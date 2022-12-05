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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\tPrograma para saber si el dividendo no es cero");
        
        double dividendo, divisor, denominador;
        System.out.println("Ingrese el dividendo: ");
        dividendo=entrada.nextDouble();
        System.out.println("Ingresa el divisor: ");
        divisor=entrada.nextDouble();
            
        if (dividendo!=0){
            denominador=dividendo;
            System.out.println("El resultado es: "+(denominador/divisor));} else{
            System.out.println("ERROR");}
    }
}
