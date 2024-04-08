package ejercicio8.vista;

import ejercicio8.modelo.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Introduce el primer numero");
        calculadora.setNum1(teclado.nextDouble());
        System.out.println("Introduce el segundo numero");
        calculadora.setNum2(teclado.nextDouble());
        boolean comprobar = false;
        do {
            System.out.println("Introduce el tipo de operacion: + - / *");
            if (calculadora.introducirOperando(teclado.next())) {
                comprobar = true;
            } else {
                System.out.println("Has introducido mal el operando");
            }
        } while (!comprobar);
        System.out.println("El resultado es:"+calculadora.calcular());
    }
}
