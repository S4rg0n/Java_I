import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Abrimos canal de comunicación/escucha mediante creación de clase Scanner:
        Scanner receptor = new Scanner(System.in);//System.in apunta la escucha hacia la entrada de datos por teclado.

        //Pedimos entrada de datos tipo String:
        System.out.println("Introduzca rol: ");
        String rol = receptor.nextLine();//Recoge la escucha en el formato pertinente.
        System.out.printf("Su rol es "+ rol + ".\n");

        /**
         * Siempre podremos recopilar el dato como string y luego realizar una conversión de tipo .parse
         * pero también podremos guardarlo directamente en el formato deseado como vermos a continuación
         * con un int como dato requerido:
         * */

        //Otro ejemplo entrada de datos tipo int:
        System.out.println("Introduzca edad: ");
        int edad = receptor.nextInt();//Recoge la escucha en el formato pertinente.
        System.out.println("Tiene " + edad + " años.");

    }
}