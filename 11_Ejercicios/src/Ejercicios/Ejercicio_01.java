package Ejercicios;

import javax.swing.*;

public class Ejercicio_01 {
    public static void main(String[] args) {
        /* Programa que solicita 2 números al usuario y devuelve por consola cuál de ellos es el mayor,
         * además de la suma, resta, multiplicación, división y módulo(resto) de estos.
        */

        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduza primer valor con el que operar: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Introduza segundo valor con el que operar: "));

        System.out.println("Ha introducido los valores:\nX = "+x+"\nY = "+y);

        if (x <= y) {
            System.out.println((x == y) ? "Ambos números son iguales." : "X es menor que Y.");
        } else System.out.println("X es mayor que Y.");
        System.out.println("Aquí están las operiaciones y resultados de:");
        System.out.println("Sumar "+x+" + "+y+" = "+(x+y));
        System.out.println("Restar "+x+" - "+y+" = "+(x-y));
        System.out.println("Multiplicar "+x+" * "+y+" = "+(x*y));
        System.out.println("Dividir "+x+" / "+y+" = "+(x/y)+" con un resto de "+(x%y));
    }
}
