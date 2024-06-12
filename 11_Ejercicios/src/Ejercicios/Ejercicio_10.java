package Ejercicios;

import javax.swing.*;

public class Ejercicio_10 {
    public static void main(String[] args) {
        // Indica si el día que introduce el usuario es laboral o no.
        String dia = JOptionPane.showInputDialog("Introduzca día de la semana:").toLowerCase().trim();

        switch (dia) {
            case "lunes":
                System.out.println("Laboral");
                break;
            case "martes":
                System.out.println("Laboral");
                break;
            case "miercoles":
                System.out.println("Laboral");
                break;
            case "miércoles":
                System.out.println("Laboral");
                break;
            case "jueves":
                System.out.println("Laboral");
                break;
            case "viernes":
                System.out.println("Laboral");
                break;
            case "sabado":
                System.out.println("No laboral");
                break;
            case "sábado":
                System.out.println("No laboral");
                break;
            case "domingo":
                System.out.println("No laboral");
                break;
            default:
                System.out.println("No es un día de la semana.");
        }
    }
}