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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte opcion;
        System.out.println("=====MENU=====");
        System.out.println("Pizza Vegetariana");
        System.out.println("\t1. Pimiento");
        System.out.println("\t2. Tofu");
        System.out.println("\t3. Variedad de hongos");
        
        System.out.println("\nPizza No Vegetariana");
        System.out.println("\t4. Pepperoni");
        System.out.println("\t5. Jamon");
        System.out.println("\t6. Salmon");
        System.out.println("\t7. Camaron");
        
        System.out.println("Numero de Pizza que desea ordenar: ");
        opcion=entrada.nextByte();
        
        switch (opcion){
            case 1:
                System.out.println("Ha elegido una Pizza Vegetariana."
                +"\nLos ingredientes que llevan son: Pimientos, salsa de tomate y quesso mozzarella");
                break;
                
           case 2:
                System.out.println("Ha elegido una Pizza Vegetariana."
                +"\nLos ingredientes que llevan son: Tofu, salsa de tomate y quesso mozzarella");
                break;
                
           case 3:
                System.out.println("Ha elegido una Pizza Vegetariana."
                +"\nLos ingredientes que llevan son: Variedad de hongos, salsa de tomate y quesso mozzarella");
                break;
                
           case 4:
                System.out.println("Ha elegido una Pizza No Vegetariana."
                +"\nLos ingredientes que llevan son: Pepperoni, salsa de tomate y quesso mozzarella");
                break;
                
           case 5:
                System.out.println("Ha elegido una Pizza No Vegetariana."
                +"\nLos ingredientes que llevan son: Jamon, salsa de tomate y quesso mozzarella");
                break;
                
           case 6:
                System.out.println("Ha elegido una Pizza No Vegetariana."
                +"\nLos ingredientes que llevan son: Salmon, salsa de tomate y quesso mozzarella");
                break;
                
           case 7:
                System.out.println("Ha elegido una Pizza No Vegetariana."
                +"\nLos ingredientes que llevan son: Camaron, salsa de tomate y quesso mozzarella");
                break;
                
           default:
               System.out.println("\nA ver baboso, la opcion elegida no existe");
        }        
    }
}
