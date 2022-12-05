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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Ingresa un numero del 1 al 7");
        dia = entrada.nextInt();
        
        System.out.println("\nSOLUCION");
        if (dia==1) {
            System.out.println("LUNES");
        } else{
            if (dia==2) {
                System.out.println("MARTES");                
            } else{
                if (dia==3) {
                    System.out.println("MIERCOLES");                  
                } else{
                    if (dia==4) {
                        System.out.println("JUEVES");                        
                    } else{
                        if (dia==5) {
                            System.out.println("VIERNES");                           
                        } else{
                            if (dia==6) {
                                System.out.println("SABADO");                               
                            } else{ 
                                if (dia==7) {
                                    System.out.println("DOMINGO");                                   
                                }
                            }     
                          }
                        }
                      }
                    }            
                 }
        System.out.println("\nSOLUCION 2");
        if (dia==1) 
            System.out.println("LUNES");
        if (dia==2) 
            System.out.println("MARTES");
        if (dia==3) 
            System.out.println("MIERCOLES");
        if (dia==4) 
            System.out.println("JUEVES");
        if (dia==5) 
            System.out.println("VIERNES");
        if (dia==6) 
            System.out.println("SABADO");
        if (dia==7) 
            System.out.println("DOMINGO");    
        
              }
    
            }
