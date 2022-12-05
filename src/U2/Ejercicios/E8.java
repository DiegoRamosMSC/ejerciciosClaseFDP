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
public class E8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double area,radio;
        System.out.println("ingrese el radio del circulo");
        radio=leer.nextDouble();
        
        area=Math.PI*Math.pow(radio,2);
        
        System.out.println("el area del circulo es: "+area);
       
        
        
        
    }
    
}
