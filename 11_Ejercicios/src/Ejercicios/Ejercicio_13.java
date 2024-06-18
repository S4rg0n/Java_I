package Ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        // Introduce un número y el programa calculará el sumatorio de los números pares y el sumatorio de los impares
        int num = 0;
        int sumPar = 0;
        int sumImpar = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        num = scn.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i%2 == 0) {
                sumPar += i;
            }else sumImpar += i;
        }
        System.out.println("El sumatorio de todos los números positivos pares es "+sumPar);
        System.out.println("El sumatorio de todos los números positivos pares es "+sumImpar);
    }
}
