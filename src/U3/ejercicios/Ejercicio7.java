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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("===Programa que muestra las horas extras trabajadas===");
        
        double horas_jornada, horas_trabajadas;
        
        System.out.println("Ingrese sus Horas de jornada semanales: ");
        horas_jornada=entrada.nextDouble();
        System.out.println("Ingrese sus Horas Trabajadas en la semana: ");
        horas_trabajadas=entrada.nextDouble();
        
        System.out.println("===Solucion 1===");
        if (horas_trabajadas>horas_jornada)
            System.out.println("Estas Trabajando Horas extras"
            +"\nTus horas extras son: "+(horas_trabajadas-horas_jornada));
        if (horas_trabajadas==horas_jornada)
            System.out.println("Estas Trabajando correctamente");
        if (horas_trabajadas<horas_jornada)
            System.out.println("Estas trabajando menos horas");
        
        System.out.println("===Solucion 2===");
        if (horas_trabajadas>=horas_jornada)
            System.out.println("Estas Trabajando Horas extras"
            +"\nTus horas extras son: "+(horas_trabajadas-horas_jornada));
         if (horas_trabajadas==horas_jornada)
            System.out.println("Estas Trabajando correctamente");
        if (horas_trabajadas<horas_jornada)
            System.out.println("Estas trabajando menos horas");
            }
    }
    

