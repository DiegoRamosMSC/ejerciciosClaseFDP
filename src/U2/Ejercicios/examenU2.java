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
public class examenU2 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        double radio, altura, volumenCono;
        //programa que calcula volumen del cono
        
        System.out.println("ingrese el radio del cono: ");
        radio=lector.nextDouble();
        System.out.println("ingrese altura del cono. ");
        altura=lector.nextDouble();
        
        volumenCono=Math.PI*Math.pow(radio,2)*altura/3;
        System.out.println("el volumen del cono es: "+volumenCono);
        
        
     
    }
    
}
