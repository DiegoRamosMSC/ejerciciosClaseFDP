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
public class ExamenU4_1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] precioDolar = new double[5];
        double precioMenor;
        for (int i = 0; i < precioDolar.length; i++) {
            System.out.println("Ingresa el precio del dolar (Dia "+(i+1)+"): ");
            precioDolar[i]=lector.nextDouble();
        }
        precioMenor=precioDolar[0];
        for (int i = 1; i < precioDolar.length; i++) {
            if (precioDolar[i]<precioMenor)
                precioMenor=precioDolar[i];
        }
        System.out.println("En los ultimos 30 dias, el menor precio del dolar ha sido: "+precioMenor);
    }
}
    

