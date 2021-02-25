/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author Carlos Navarrete
 */
public class EsMayorQue21 {
    public static void main(String [] args)
    {
        Scanner miscanner = new Scanner(System.in);
        System.out.println("Ingrese Edad: ");
        int Edad = miscanner.nextInt();
        
        if(Edad >= 21)
            System.out.println("Usted es mayor a 21.");
        else
           System.out.println("Usted es menor a 21.");
    }
    
}
