package Ejercicios;

import javax.swing.*;

public class Ejercicio_07 {
    public static void main(String[] args) {
        /* Muestra los números naturales entre 1 y el número indicado por el usuario
        *  que sean divisibles entre 2 y 3
        */
        int num = Integer.parseInt(JOptionPane.showInputDialog("Hasta qué número quieres el listado de divisibles por 2 y 3"));

        if (num <= 1){
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Entrada incorrecta, introduzca un número mayor que 1"));
            }while (num <= 1);
        }

        System.out.println("Estos son los números divisibles entre 2 y 3 desde el 1 hasta el "+num);
        for (int i = 1; i <= num; i++) {
            if (i%2==0 && i%3==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\nFin de programa.");
    }
}
