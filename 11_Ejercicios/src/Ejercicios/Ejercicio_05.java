package Ejercicios;

import javax.swing.*;

public class Ejercicio_05 {
    public static void main(String[] args) {
        // Realiar la suma de todos los números que vayan desde del
        // 1 hasta el número que indiquemos, el cual debe ser mayor que 1.
        int num;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número mayor que 1:"));
        }while (num <= 1);
        int sumatorio = 0;
        for (int i = 1; i <= num; i++) {
            sumatorio += i;
        }
        System.out.println("El sumatorio desde 1 hasta "+num+" es "+sumatorio);
    }
}
