/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 El programa deberá después mostrar el resultado de la suma
 */
package gui2ejer01;

import java.util.Scanner;

/**
 *
 * @author Rosario
 */
public class Gui2Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        int num1; int num2; int suma;
        System.out.println("Ingresar numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingresar numero 2");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("la suma de " + num1 + " + " + num2 + " es " + suma);
    }
   }
