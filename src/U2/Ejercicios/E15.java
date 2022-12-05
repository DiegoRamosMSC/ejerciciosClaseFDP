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
public class E15 {
    public static void main(String[] args) {
        int x, y, aux;
        //aux es una variable que funciona como auxiliar
        Scanner lector= new Scanner(System.in);
        
        System.out.println("ingresar valor de x: ");
        x=lector.nextInt();
        System.out.println("ingresar el valor de y;");
        y=lector.nextInt();
        
        aux=x;
        x=y;
        y=aux;
        
        System.out.println("el valor de x es:"+x);
        System.out.println("el valor de y es:"+y);
        System.out.println("jaja te trolie never gona give you are.......jsjsjjs");
    }
    
}
