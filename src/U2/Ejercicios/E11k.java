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
public class E11k {
    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   int cantidad,precio,total,cambio,pago;
        String nombre;
        System.out.println("hola que tal!!!");
        System.out.println("\ningrese el producto que desea comprar");
        nombre=leer.next();
        System.out.println("ingrese el precio del producto");
        precio=leer.nextInt();
        System.out.println("ingrese cantidad de productos");
        cantidad=leer.nextInt();
       
        total=precio*cantidad;
      
        System.out.println("El total a pagar por "+nombre+ " es $"+total);
        
        System.out.println("\ningrese la cantidad con la que pagara");
        pago=leer.nextInt();
        
        
        cambio=pago-total;
       
        System.out.println("Su cambio es $"+cambio+" hasta luego");
    }
}
