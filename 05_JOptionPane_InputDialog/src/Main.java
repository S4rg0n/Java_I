import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String rol = JOptionPane.showInputDialog("Introduzca rol:");
        System.out.println(rol + ".");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad:"));
        System.out.println(edad + " años.");

    }
}
