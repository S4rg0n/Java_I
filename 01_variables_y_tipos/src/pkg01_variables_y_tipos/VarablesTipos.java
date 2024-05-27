/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_variables_y_tipos;

/**
 *
 * @author arcmo
 */
public class VarablesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Datos primitivos
         */
        // Declaración byte:
        byte edad = 41;
        System.out.println(edad);
        
        // short = 2 bytes:
        short caballeria = 150;
        System.out.println(caballeria);
        
        // int = 4 bytes:
        int lanceros = 1000;
        System.out.println(lanceros);
        
        // long = 8 bytes; añadimos el literal 'l' en la inicialización para que reserve el espacio total de memoria.
        long saldo = 150000l;
        System.out.println(saldo);
        
        // char para un solo caracter
        char letra = 'A';
        System.out.println(letra);
        // si damos como char un entero, buscará su correspondiente valor unicode asociado
        char valor = 85;
        System.out.println(valor);
        
        // bool
        boolean apto = true;
        System.out.println(apto);
        
        // float para decimales 32bits; añadimos el literal 'f' en la inicialización para que reserve el espacio total de memoria.
        float precio = 123f;
        System.out.println(precio);
        
        // double para decimales de 64 bits; puede o no llevar el literal 'd':
        double longDec = 1234.53412343d;
        System.out.println(longDec);
        
        /**
         * Tipo String, no primitivo, sino un tipo objeto.
         */
        String frase = "Bienvenido a Java world";
        System.out.println(frase);
        
    }
    
}
