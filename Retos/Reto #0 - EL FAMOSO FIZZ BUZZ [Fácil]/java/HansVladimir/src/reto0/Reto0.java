/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto0;

/**
 *
 * @author User
 */
public class Reto0 {

    /**
    * Escribe un programa que muestre por consola (con un print) los
    * números de 1 a 100 (ambos incluidos y con un salto de línea entre
    * cada impresión), sustituyendo los siguientes:
    * - Múltiplos de 3 por la palabra "fizz".
    * - Múltiplos de 5 por la palabra "buzz".
    * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    public static void main(String[] args) {
        

        for (int i = 1; i <= 100; i++) {
            
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }
            else if(i%3==0){
                System.out.println("fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
