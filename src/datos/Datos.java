/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //se llama input
        System.out.println("Escribir nombre");  //salida de texto
        String texto = input.nextLine();        //capturar datos del teclado y guardarlo en la variable
        System.out.println("Escribir nombre");  //salida de texto
        System.out.println("Saludos "+texto);   //salida de texto
        
        System.out.println("Escribir Primer Número");  //salida de texto
        String num01 = input.nextLine();
        System.out.println("Escribir Segundo Número");
        String num02 = input.nextLine();
        int resultado = Integer.parseInt(num01) + Integer.parseInt(num02);
        System.out.println("El resultado es: "+resultado);
    }
    
}
