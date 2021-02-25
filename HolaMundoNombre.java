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
public class HolaMundoNombre {
    public static void main (String[] args)
    {
       Scanner miscanner = new Scanner(System.in);
       System.out.println("Ingrese Nombre: ");
       String Nom = miscanner.nextLine();
       System.out.println("Ingrese Edad: ");
       int Edad = miscanner.nextInt();
       System.out.println("Ingrese Altura: ");
       double Altura = miscanner.nextDouble();
       
       System.out.println("Nombre: "+Nom); 
       System.out.println("Edad: "+ Edad);
       System.out.println("Altura: "+Altura);
    }
}
