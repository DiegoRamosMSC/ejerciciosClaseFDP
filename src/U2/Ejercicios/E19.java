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
public class E19 {
     public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double tmb, kilos, altura, edad;
        double cdn,calP,grasa,carB;
        double kalPadel;
        double grP,grC, grG;
        System.out.println("ingresar su peso en kilos");
        kilos=leer.nextDouble();
        System.out.println("ingresar su altura en cm");
        altura=leer.nextDouble();
        System.out.println("ingresar su edad");
        edad=leer.nextDouble();
        
        tmb=(10*kilos)+(6.25*altura)-(5*edad)+5;
        
        System.out.println("\nsu tasa metabolica basal es de: "+tmb);
        
        cdn=tmb*1.55;
        
        System.out.println("\nsus calorias diarias necesarias son: "+cdn);
        
        kalPadel=cdn-(cdn*0.15);
        System.out.println("\nsus calorias para adelgazar son: "+kalPadel);
        
        calP=kalPadel*0.35;
        grasa=kalPadel*0.25;
        carB=kalPadel*0.50;
        
        System.out.println("\nsus calorias de proteinas son: "+calP);
        System.out.println("\nsus grasas son: "+grasa);
        System.out.println("\nsus carbohidratos son: "+carB);
        
        grP=calP/4;
        grC=carB/4;
        grG=grasa/9;
                
        System.out.println("\nsus gr en proteinas son: "+grP );
        System.out.println("\nsus gr de carbohidratos son: "+grC);
        System.out.println("\nsus gr de grasa son: "+grG);
    }
    
}
