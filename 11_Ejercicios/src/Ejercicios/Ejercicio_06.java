package Ejercicios;

import javax.swing.*;

public class Ejercicio_06 {
    public static void main(String[] args) {
        /* Lectura de número por teclado que devuelve su
        *  asociado en código ASCII
        */
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        char caracter = (char) num;
        System.out.println("El "+num+" en ASCII corresponde a "+caracter);
        System.out.println("Ejemplo de typecasting explícito en línea 13 nos indica que al carácter '=' le corresponde en ASCII el número "+(int) '=');
    }
}
