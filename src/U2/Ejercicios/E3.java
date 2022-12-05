/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class E3 {
    public static void main(String[] args) {
        //programa que realiza una resta
        
        Scanner leer =new Scanner (System.in);
        int valor1, valor2, resultado;
        System.out.println("ingrese el primer numero: ");
        valor1=leer.nextInt();
        System.out.println("iongrese el segundo numero:");
        valor2=leer.nextInt();
        resultado=valor1-valor2;
        System.out.println("el resultado de la resta es: "+resultado);
    }    
}
