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
public class E4 {
    //programa que calcula la edad
    public static void main(String[] args) {
        Scanner sc=new Scanner  (System.in);
        int nacimiento, actual, edad;
        System.out.println("ingrese el anio de nacimiento: ");
        nacimiento=sc.nextInt();
        System.out.println("ingrese el anio actual: ");
       actual=sc.nextInt();
      edad=actual-nacimiento;
       System.out.println("su edad es: "+edad);
       
        
        
        
        
        
        
    }
    
}
