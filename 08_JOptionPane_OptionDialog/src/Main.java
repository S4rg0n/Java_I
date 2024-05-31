import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion = JOptionPane.showOptionDialog(null, "Elige nivel:", "Selección de nivel",
                0,
                1,
                null,
                new Object[]{"Junior", "Mid", "Senior"},
                "Junior");
        System.out.println(opcion);
    }
}