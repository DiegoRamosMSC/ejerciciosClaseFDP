/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte semestre, promedio;
        System.out.println("Programa que evalua las condiciones de un alumno para otorgarle una beca");
        System.out.println("Ingresa tu semestre: ");
        semestre=entrada.nextByte();
        System.out.println("Ingresa tu promedio de calificacion: ");
        promedio=entrada.nextByte();
        
        
        if (semestre>=4 && semestre<=8 || promedio>=90) {
            System.out.println("Felicidades. Eres merecedor de una beca");          
        } else {
            System.out.println("Lo lamento, intentalo el proximo semestre");
        }    
    }
    
}
