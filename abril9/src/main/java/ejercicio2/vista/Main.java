package ejercicio2.vista;

import ejercicio2.modelo.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculadora.suma(3,4));
        System.out.println(Calculadora.resta(8,3));
        System.out.println(Calculadora.multiplicacion(5,3));
        System.out.println(Calculadora.dividir(21,3));
        System.out.println(Calculadora.dividir(10,0));
    }
}
