import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Cada botón de la ventana de diálogo siguiente devuelve un valor entero asociado:
        int  opciones = JOptionPane.showConfirmDialog(null, "Elige: ", "Opciones",1, 0);
        // Lo mostramos por ventana y por consola:
        JOptionPane.showMessageDialog(null, "La opción escogida devuelve un "+opciones+"; puedes comprobarlo en consola.");
        System.out.println(opciones);
    }
}