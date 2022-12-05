/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4;

/**
 *
 * @author jesus
 */
public class E5 {
    public static void main(String[] args) {
        String[]  pokemones={"treecko","totodile","torchic","torkoal","psyduck","wobbufet","cydaquil"};
       //diferencia de for y fore
       
       //fori
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i+1)+"."+pokemones[i]);
           
        } System.out.println( "n\\ ");
        
        //fore
        int i=1;
        for (String pokemon : pokemones) {            
            System.out.println(i+"."+pokemon);
            i++;
        }
    }
}
