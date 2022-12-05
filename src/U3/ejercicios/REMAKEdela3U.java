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
public class REMAKEdela3U {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        byte mes, dia;
       
         System.out.println("ingresa el numero de mes que naciste: ");
         mes=lector.nextByte();
         
         System.out.println("ingresa el dia que naciste: ");
         dia=lector.nextByte();
         
         switch(mes){
             
             case 1: 
                           if(dia>=1 && dia<=20) 
                                System.out.println("tu signo es capricornio ");
            
                            if(dia>=21&&dia<=31)
                   
                                System.out.println("tu signo es acuario");
                            break;          
                            
             case 2:   
                             if(dia>=1 &&dia <=19)
                                 System.out.println("tu signo es acuario");
                            if(dia>20 &&(dia<=28|| dia<=29))
                            System.out.println("tu signo es piscis");
                            
                           break;
             
             case 3:
                 if(dia>=1 && dia<=20) 
                       System.out.println("tu signo es piscis");
                     
                 if(dia>=21&&dia<=31)
                     System.out.println("tu signo es aries");
                 
                 break;
                 
             default:
                 System.out.println("el programa solo considera los signos zodiacales entre enero y marzo...");
             
             
         }    
    }
}
