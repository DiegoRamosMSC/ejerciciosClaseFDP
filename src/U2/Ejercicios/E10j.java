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
public class E10j {
    public static void main(String[] args) {
        
        //programa que recibe un numero en sistema binario, octal y hexadecimal
        //y lo convierte a su equivalente en sistema octal
        
        Scanner lector= new Scanner (System.in);
        int numero;
        System.out.println("\n\n ingrese un numero en sistema binario");
        numero=lector.nextInt(2);
        System.out.println("su equivalente en sistema decimal es:"+numero);
        
        System.out.println("\n\n ingrese un numero en sistema octal");
        numero=lector.nextInt(8);
        System.out.println("su equivalente en sistema decimal es:"+numero);
        
                System.out.println("\n\n ingrese un numero en sistema hexadecimal");
        numero=lector.nextInt(16);
        System.out.println("su equivalente en sistema decimal es:"+numero);
        
    }
}
