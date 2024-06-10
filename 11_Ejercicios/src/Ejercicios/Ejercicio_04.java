package Ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        // Par o impar??
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduzca número para determinar su paridad: ");
        int num = scn.nextInt();
        System.out.println(num%2 == 0 ? num+" es par." : num+" es impar.");
        scn.close();
    }
}
