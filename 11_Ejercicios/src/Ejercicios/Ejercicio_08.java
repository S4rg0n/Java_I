package Ejercicios;

import javax.swing.*;

public class Ejercicio_08 {
    public static void main(String[] args) {
        /* Programa que realiza el sumatorio de todas las ventas realizadas;
        *  primero nos pedirá cuántas ventas son, y después el valor de cada una de ellas.
        */
        int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Cuántas ventas se han realizado??"));
        double ganancias = 0;
        for (int i = 0; i < numVentas; i++) {
            ganancias += Double.parseDouble(JOptionPane.showInputDialog("Idique precio de venta "+(i+1)));
        }
        System.out.println("Los beneficios totales de realizar "+numVentas+" ventas son "+ganancias+"€");
    }
}
