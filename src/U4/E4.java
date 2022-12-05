/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class E4 {
    public static void main(String[] args) {
        //programa que determina cual es el numero mayor almacenado en el arreglo
        Scanner lector= new Scanner(System.in);
        int[]estaturaAlumnos=new int[10];
        int estaturaMayor=0;
        
        //ciclo For para rellenar el arreglo
        for (int i = 0; i < estaturaAlumnos.length; i++) {
            System.out.println("ingresa la estatura del alumno " + (i+1));
            estaturaAlumnos[i]=lector.nextInt();           
        }
        //ciclo FOR para comparar los numeros
        for (int i = 0; i < estaturaAlumnos.length-1; i++) {
            if (estaturaAlumnos[i]<estaturaAlumnos[i+1]) 
           
            {
                 estaturaMayor=estaturaAlumnos[i+1];
            }
            System.out.println("la mayor estatura de un alumno es:"+estaturaMayor);
        }
        
        
    }
}
