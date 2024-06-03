import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edead:"));

        if(edad <= 18){
            System.out.println("Eres menor de edad.");
        }else System.out.println("Eres mayor de edad.");
    }
}