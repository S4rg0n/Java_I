package Ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        // Factorial de un número introducido.
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduza número para cálculo factorial: ");
        int num = scn.nextInt();
        int fact = num;
        for (int i = num-1; i > 1; i--) {
            fact *= i;
        }
        System.out.println("El factorial de "+num+" es "+num+"! = "+fact);
    }
}
