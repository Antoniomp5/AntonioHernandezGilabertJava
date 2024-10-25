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
public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las notas.  ");
        int i = sc.nextInt();
        int x = sc.nextInt();
        float a;
   
        a = (i + x) / 2F;
        
        System.out.println("La media es. " + a);
    }
}
