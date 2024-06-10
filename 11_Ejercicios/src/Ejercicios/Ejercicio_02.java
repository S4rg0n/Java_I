package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Pide un nombre por consola  y despúes muestra un mensaje de bienvenida con dicho nombre
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduzca nombre: ");
        String nombre = scn.nextLine();
        System.out.println("Bienvenido "+nombre);
        scn.close();
    }
}
