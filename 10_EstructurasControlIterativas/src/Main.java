public class Main {
    public static void main(String[] args) {

        // While:
        int contador = 0;
        while (contador <= 10){
            contador++;
            System.out.println( (contador-1)==10 ? "Iteración nº "+contador+". Saliendo de bucle." : "Iteración nº "+contador);
        }
        System.out.println("Fuera de While.\n");

        // Do-While:
        contador = 0;
        do {
            contador++;
            System.out.println( (contador-1)==10 ? "Iteración nº "+contador+". Saliendo de bucle." : "Iteración nº "+contador);
        } while (contador <= 10);
        System.out.println("Fuera de Do-While.\n");

        /* La única diferencia es que si la condición del while en la primera operación lógia no se cumpliera,
         * con el whíle no se ejecutaría el bloque de código en ningún momento, mientras que con Do-While nos
         * garantizaríamos la ejecución del código al menos una vez.*/

        // For
        for (contador =0; contador <=10; contador++){
            System.out.println( (contador)==10 ? "Iteración nº "+(contador+1)+". Saliendo de bucle." : "Iteración nº "+(contador+1));
        }
        System.out.println("Fuera de For.\n");

    }
}