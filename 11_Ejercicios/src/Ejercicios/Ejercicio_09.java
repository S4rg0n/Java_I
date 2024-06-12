package Ejercicios;

import javax.swing.*;

public class Ejercicio_09 {
    public static void main(String[] args) {
        /* Aplicación de introducción de contraseña con 3 intentos. Cuando se acierta, mostrará mensaje, si
        *  se falla las tres veces, informa y termina el programa.
        */
        String pass = "1234";
        int intentos = 1;
        boolean habilitado = true;
        do {
            String income = JOptionPane.showInputDialog("Introduzca password:");
            if (pass.equals(income)){
                JOptionPane.showMessageDialog(null, "Access granted. Proceed.");
                habilitado = false;
            } else if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Access blocked. Shutting down system.");
                habilitado = false;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password, "+(3-intentos)+" attempt(s) left.");
                intentos++;
            }
        }while (habilitado);
    }
}
