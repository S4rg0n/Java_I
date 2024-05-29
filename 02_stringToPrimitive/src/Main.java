//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String saludo = "Hola";
        char caracter = saludo.charAt(0);
        System.out.println(caracter);

        String numEscrito = "10";
        int numA = Integer.parseInt(numEscrito);
        int numB = Integer.valueOf(numEscrito);
        System.out.println(numA + " y " + numB);

    }
}