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
public class E7 {
    public static void main(String[] args) {
        // declaracion de la matriz 
       // String[][] alumnos =new String[4][5];
        // declaracion de la matriz con elementos     
String [][]profesores= {{"jose juan ","cesar ","ivan "},
                                         {"briseida ","miguel ","maria "},
                                           {"marcos ","nancy ","maria "}};

        //declaracion de matriz con tamaño personalizado
 int[][] respuestas_eval_docente;
 int filas, columnas;
 Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el numero de filas de la matriz: ");
        filas=lector.nextInt();
        System.out.println("ingrese numero de columnas de la matriz: ");
        columnas=lector.nextInt();
        respuestas_eval_docente= new int[filas][columnas];
        
        //imprimir contenido de la matriz
        for (int i = 0; i < respuestas_eval_docente.length; i++) {
            for (int j = 0; j < respuestas_eval_docente.length; j++) {
                System.out.print(profesores [i][j]+ "");
                
            }
            System.out.println("");
        }
 
                                           
}
    }
