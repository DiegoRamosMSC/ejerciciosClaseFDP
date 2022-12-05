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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector=  new Scanner (System.in);
        int noviasBadBunny, noviasTiti;
        //condicionales
        System.out.println("titi me pregunó si tengo muchas novias");
        System.out.println("titi: -badB ¿cuantas novias tienes?");
        noviasBadBunny=lector.nextInt();
        System.out.println("BadB: -y tu titi ¿cuantas novias tienes?");
        noviasTiti=lector.nextInt();
        
        //inicio de la instuccion condicional
        if(noviasBadBunny==noviasTiti) //cantidad igual de novias 
            System.out.println("bad tiene la misma cantidad de novias que titi");
        
        if(noviasBadBunny>noviasTiti) //bad tiene mas novias
            System.out.println("bad tiene mas novias que titi");
        
        else{
            
            if(noviasBadBunny<noviasTiti) //bad tiene menos novias que titi
            System.out.println("titi tiene mas novias que bad");
            
             }
    }
}
