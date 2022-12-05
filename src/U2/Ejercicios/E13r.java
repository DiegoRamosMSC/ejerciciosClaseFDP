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
public class E13r {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double salario;
        System.out.println("ingrese la cantidad del salario: ");
        salario=leer.nextDouble();
        salario=salario*1.25;
        System.out.println("su salario con un 25% de incremento es: $"+salario);
        
        
    }
}
