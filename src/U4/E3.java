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
public class E3 {
    //programa que realiza una busqueda secuencial en el ARREGLO
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
       int[] temperaturas={35,28,32,37,30};
       int dato, vecesEncont=0;
       boolean encontrado=false;
        System.out.println("ingresa el valor a buscar; ");
        dato=lector.nextInt();
        
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i]==dato){
                encontrado=true; //esta variable actua como una bandera
                System.out.println("el dato "+dato+" se encuentra en la posicion "+i+" del arreglo");
                break;
            }
            
        }
        //al finalizar el ciclo podemos comprobar el valor con el que finaliza la variable bandera
        
        if(encontrado==true)
            System.out.println("el dato fue encontrado");
        else
            System.out.println("no se encontro el dato");
          
        
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        double[] calificaciones={100,70,85,5,70,100,100};
       String posiciones="";
        System.out.println("ingresa el valor a buscar: ");
        dato= lector.nextInt();
        for (int i = 0; i < calificaciones.length; i++) {
        if (calificaciones[i]==dato)
        vecesEncont++;
        posiciones+=i+",";
            
        }
        
        System.out.println("el dato " +dato+ " se encontro " + vecesEncont + " veces de las posiciones "+ posiciones+ " del arreglo."); 
        
        
    }
}
