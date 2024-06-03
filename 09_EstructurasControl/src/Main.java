import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edead:"));

        // Control de flujo if, if-else, else-if
        if(edad <= 18){
            System.out.println("Eres menor de edad.");
        }else if(edad <= 67){
            System.out.println("Mayor de edad y en edad de trabajar.");
        }else System.out.println("Eres mayor de edad y disfrutando de la jubilación.");// Entre llaves si es más de 1 sentencia

        String sexo = JOptionPane.showInputDialog("Introduzca sexo (H/M):").toLowerCase();

        // Control de flujo switch
        switch (sexo){
            case "h":
                System.out.println("Hombre.");
                break;// Obligatorio o se ejecutarán todos los case
            case "m":
                System.out.println("Mujer.");
                break;
            default:
                // Ternaria  condición ? then : else
                System.out.println( sexo.isEmpty() ? "Sexo no especificado." : "Sexo introducido no reconocido." );
                break;
        }

        System.out.println("Fin de programa.");
    }
}