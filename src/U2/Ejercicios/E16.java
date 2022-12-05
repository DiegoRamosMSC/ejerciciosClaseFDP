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
public class E16 {
    public static void main(String[] args) {
        //programa que calcula la cantidadndensegundos en base a una cantidad de dias, horas y minutos
        
        Scanner leer =new Scanner(System.in);
        int dias, horas, min, dias_segundos, horas_segundos, minutos_segundos, total;
        System.out.println("engrese el numero de dias;");
        dias=leer.nextInt();
        System.out.println("ingresa el numero de horas:");
        horas=leer.nextInt();
        System.out.println("ingrese el numero de minutos:");
        min=leer.nextInt();
        dias_segundos=dias*24*60*60;
        horas_segundos=horas*60*60;
        minutos_segundos=min*60;
        
        total=dias_segundos+horas_segundos+minutos_segundos;
        System.out.println("total de segundos es: "+total);
        
    }
    
}
