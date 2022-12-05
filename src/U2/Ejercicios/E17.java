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
public class E17 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num, dias, horas, min;
        
        System.out.println("ingrese cantidad de segundos: ");
        num=leer.nextInt();
        
        dias=num/86400;
        num=num%86400;
        horas=num/3600;
        num=num%3600;
        min=num/60;
        num=num%60;
        System.out.println(">>>>>"+dias +"dia(s)"+horas +"hora(s)"+min +"min " + num+ "seg");
        
        
        
        
    }
    
}
