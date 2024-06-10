package Ejercicios;

import javax.swing.*;

public class Ejercicio_03 {
    public static void main(String[] args) {
        // Pide un nombre por ventana y despúes muestra un mensaje de bienvenida con dicho nombre de la misma forma
        String nombre = JOptionPane.showInputDialog("Introduza nombre:");
        String msg = "Bienvenido " + nombre;
        JOptionPane.showMessageDialog(null, msg);
    }
}
