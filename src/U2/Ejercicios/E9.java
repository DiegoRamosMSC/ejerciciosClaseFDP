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
public class E9 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double base1,base2,altura,area;
        System.out.println("ingrese la base mayor del trapecio");
        base1=lector.nextDouble();
        System.out.println("ingrese la base menor del trapecio");
        base2=lector.nextDouble();
        System.out.println("ingrese la altura del trapecio");
        altura=lector.nextDouble();
        area=(base1+base2*altura)/2;

        System.out.println("el area del trapecio es: "+area);
    }
    
}
