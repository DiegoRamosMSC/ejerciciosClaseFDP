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
public class examenU2p2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double califExamen, califEjercicios, califInvestigacion, calfFinal;
        //programa que calcula la calificacion de la unidad 2
        
        System.out.println("ingrese la calificacion del examen: ");
        califExamen= sc.nextInt();
        System.out.println("ingrese la calificacion de los ejercicios: ");
        califEjercicios= sc.nextInt();
        System.out.println("ingrese la calificacion de la investigacion: ");
        califInvestigacion= sc.nextInt();
        
        calfFinal=califExamen*0.40+califEjercicios*0.35+califInvestigacion*0.25;
        System.out.println("La calificacion final de la unidad 2 es: "+calfFinal);
        
    }
}
