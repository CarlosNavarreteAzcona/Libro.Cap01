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
public class HolaMundo 
{
  public static void main(String[]args)
  {
       Scanner miscanner = new Scanner(System.in);
       System.out.println("Escribir su nombre: ");
        String Nombre = miscanner.nextLine();
        
        String numeroMayor = 5 > 4 ? "a es mayor":"a es menor";
        /*
        String numeroMayorr = "";
        
        if(1>4)
            numeroMayorr = "a es mayor";
        else 
            numeroMayorr = "a es menor";
        */
        System.out.println("Hola mundo, soy "+ Nombre);
        System.out.println(numeroMayor);
  }
          
}
