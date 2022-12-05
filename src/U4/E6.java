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
public class E6 {
    private static final String ANSI_YELLOW="\u0018(33m)";
    
    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner(System.in);
        String[] productos= new String[10];
        String respuesta, nombreOld;
        int Indice;

        
        for (int i = 0; i < productos.length; i++) {
            System.out.println(ANSI_YELLOW+"ingrese el nombre del producto: "+(i+1)+" ");
            
            
            productos[i]=lector.nextLine();
        }
        
        
        System.out.println("\n\n+++elementos ingresados al vector+++");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1)+"."+productos[i]);    
            
            
        }
               
        System.out.println("\n>>>desea modificar algun producto? SI(S) NO(N)");
        respuesta=lector.next().toUpperCase();        
        do {
                  if (respuesta.equals("SI") || respuesta.equals("S")) {
                System.out.println("---ingrese el numero de productos a editar: ");
                Indice=lector.nextInt()-1;
                
                
                lector.nextLine();
                
                nombreOld=productos[Indice];
                System.out.println("---ingrese el nuevo nombre del producto: ");
                productos[Indice]=lector.nextLine();
                
                
                System.out.println("\n***usted a cambiado el producto"+nombreOld+"por: "+productos[Indice]);
                
                System.out.println("\n>>>desea modificar otro producto? SI(s) No(N)");
                respuesta=lector.next().toUpperCase();
                  }
             } while (respuesta.equals("SI") || respuesta.equals("S"));
}

}