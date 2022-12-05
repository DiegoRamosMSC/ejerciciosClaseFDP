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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("=====Programa que determina si un numero es negativo o positivo");
        System.out.println("Ingrese un numero: ");
        numero=entrada.nextInt();
        
        if (numero>0) 
            System.out.println("El numero es Positivo");
        if (numero<0)
            System.out.println("El numero es Negativo");
        
    }
}
