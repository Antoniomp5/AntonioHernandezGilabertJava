/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-10
 */
public class Ejercicio3 {
     public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su año de nacimineto.  ");
        int x = sc.nextInt();
        System.out.println("Introduzca el año en el que está.  ");
        int i = sc.nextInt();
         int a = i - x; 
        
                
        System.out.println("Su edad es:  " + a);
          
      }
    
}

    
