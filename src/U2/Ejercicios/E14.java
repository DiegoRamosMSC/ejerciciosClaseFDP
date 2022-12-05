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
public class E14 {
    public static void main(String[] args) {
        //declaracion de  constantes
        
        final double DESCUENTO=0.10;
        Scanner lector= new Scanner(System.in);
        double subtotal, total;
        System.out.println("ingrese el total de compra");
        subtotal=lector.nextDouble();
        total=subtotal-(subtotal*DESCUENTO);
        System.out.println("el total de compra con descuento es: "+total);
        
    }
   
}
