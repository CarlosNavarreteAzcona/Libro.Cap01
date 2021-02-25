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
public class ParOImpar {
    public static void main(String [] args)
    {
        Scanner miscanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int valor = miscanner.nextInt();
        int resto = valor % 2;
        if(resto == 0)
            System.out.println("El valor de " + valor + " es par.");
        else
            System.out.println("El valor de " + valor + " es impar.");
    }
}
