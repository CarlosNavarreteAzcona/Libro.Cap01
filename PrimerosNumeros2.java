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
public class PrimerosNumeros2 {
    public static void main(String [] args)
    {
       Scanner miscanner = new Scanner(System.in);
       System.out.println("Ingrese : ");
       int n = miscanner.nextInt();
       int i = 1;
       do
       {
           System.out.println("Iteracion " + i);
           i++;
       }while(i <= n);   
    }
}
