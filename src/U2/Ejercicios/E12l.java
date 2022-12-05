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
public class E12l {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //programa que calcula area, hipotenusa y perimetro de un triango rectangulo.
        
        double c1, c2, hipotenusa, area, perimetro;
        //hipotenusa
        
        System.out.println("valor de cateto 1: ");
        c1=leer.nextDouble();
        System.out.println("valor cateto 2: ");
        c2=leer.nextDouble();
        hipotenusa=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
        area=c1*c2/2;
        perimetro=c1+c2+hipotenusa;
        
        System.out.println("perfecto!!!!");
        System.out.println("el valor de la hipotenusa es: "+hipotenusa);
          System.out.println("el valor del area es: "+area);
            System.out.println("el valor del perimetro es: "+perimetro);
        
        
        
        
    }
}
