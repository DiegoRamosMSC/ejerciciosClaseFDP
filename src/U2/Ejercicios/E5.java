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
public class E5 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        double libras, kilos;
        System.out.println("ingrese valor de libras");
        libras= lector.nextDouble();
        kilos=libras*0.454;
        System.out.println("el resultado es: "+kilos);
    }
}
