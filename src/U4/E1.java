/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class E1 {
    public static void main(String[] args) {
        // declaracion del arreglo
        int[ ] numeros =new int[5];      
        
        // asignacion directa de los valores
        
        numeros[0]=120;
        numeros[1]=37;
        numeros[2]=15;
        numeros[3]=28;
        numeros[4]=11;
        
        //otra forma de declarar el arreglo
        int[] numero2 = {100,70,65,208,23,11};
        
        //siguiente forma de declarar el vector
        int[] numero3;
        Scanner lector= new Scanner(System.in);
        int tamanio;
        System.out.println("ingrese el tamaño del arreglo: ");
        tamanio=lector.nextInt();
        numero3 = new int[tamanio];
        
        //imprimir o mostrar el contenido del vector
        
        System.out.println(""+Arrays.toString(numeros));
        System.out.println(""+Arrays.toString(numero2));
        System.out.println(""+Arrays.toString(numero3));
        
        //imprimir o mostrar el contenido del vector utilizando ciclos
        System.out.println("impresion del vector numeros: ");
        for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i ]+",");
        }
         System.out.println("impresion del vector numeros2: ");
        for (int i=0; i< numero2.length; i++){
            System.out.println(numero2[i ]+",");
        }
         System.out.println("impresion del vector numeros3: ");
        for (int i=0; i< numero3.length; i++){
            System.out.println(numero3[i ]+",");
        }
    
    }
}
