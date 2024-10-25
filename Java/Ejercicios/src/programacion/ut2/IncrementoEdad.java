package programacion.ut2;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-10
 */
public class IncrementoEdad {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad.  ");
        int i = sc.nextInt();
        i ++;
        System.out.println("Su edad del año siguente es:  " + i);
        
        
    }
    
}
