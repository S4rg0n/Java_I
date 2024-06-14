package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
//       Crea una aplicación tipo calculadora, nos pedirá 2 operandos (int) y
//       un signo aritmético (String), según este último se realizara la operación
//       correspondiente. Al final mostrara el resultado en un cuadro de dialogo
//       (JOptionPane).
//
//       Los signos aritméticos disponibles son:
//          +: suma los dos operandos.
//          -: resta los operandos.
//          *: multiplica los operandos.
//          /: divide los operandos, este debe dar un resultado con decimales (double)
//          %: módulo, resto de la división entre operandol y operand02.

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduza primer operando: ");
        int num1 = scn.nextInt();
        System.out.print("Introduza segundo operando: ");
        int num2 = scn.nextInt();
        System.out.println("Qué operación desea realizar??\n" +
                "+: suma\n" +
                "-: resta\n" +
                "*: multiplica\n" +
                "/: divide\n" +
                "%: módulo (resto)");
        String operacion = scn.next();// nextLine() toma toda la línea, espacios en blanco y saltos de linea incluidos.

        switch (operacion){
            case "+":
                JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+ (num1+num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+ (num1-num2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, num1+" * "+num2+" = "+ num1*num2);
                break;
            case "/":
                JOptionPane.showMessageDialog(null, num1+" / "+num2+" = "+ ((double)num1/(double)num2));
                break;
            case "%":
                JOptionPane.showMessageDialog(null, "Resto de dividir "+num1+" / "+num2+" es "+ (num1%num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Datos erróneos, finalizando programa.");
        }
        System.out.println("Fin de programa.");
        scn.close();
    }
}
