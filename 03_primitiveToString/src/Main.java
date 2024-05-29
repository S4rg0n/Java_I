//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Dado un string vacío:
        String listaNums = "";
         // Y un número:
        int numero = 56;
        // Tenemos 3 métodos para convertirlo a string; vamos a concatenarlos de manera que aparezcan en el
        // mismo string separados por espacio:
        listaNums += (Integer.toString(numero) + " ");
        listaNums += (String.valueOf(numero) + " ");
        listaNums += (numero + " ");
        System.out.println(listaNums);

    }
}