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
public class Examenu3ejercicio1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        int peso, zona;
        
        
        System.out.println("zonas de envio");
        System.out.println("1.-America\n2.-Europa\n3.-Asia\n");
        zona=lector.nextInt();
           System.out.println("introduce el peso del paquete en kilogramos: ");
          peso= lector.nextInt();
          
          if(peso>5)
              System.out.println("el paquete no puede ser emitido por temas de seguridad: ");
          if (peso<=0)
              System.out.println("el peso del paquete debe ser un entero mayor a cero. ");
          if (peso>0&&peso<=5){
          
        switch(zona){
            
            case 1 -> System.out.println("El paquete de " +peso+ " kilogramos enviado a America se envia por " +(peso*24)+" dolares.");
                 
            case 2 -> System.out.println("El paquete de " +peso+ " kilogramos enviado a Europa se envia por " +(peso*15)+" dolares.");
                      
            case 3 -> System.out.println("El paquete de " +peso+ " kilogramos enviado a Asia se envia por " +(peso*21)+" dolares.");

                }
          }
       }
    }