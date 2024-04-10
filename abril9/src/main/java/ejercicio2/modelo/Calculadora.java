package ejercicio2.modelo;

public class Calculadora {


    public static double suma(double n1, double n2) {
        return n1+n2;
    }

    public static double resta(double n1, double n2) {
        return n1-n2;
    }

    public static double multiplicacion(double n1, double n2) {
        return n1*n2;
    }

    public static String dividir(double n1, double n2) {
        if (n2 != 0) {
            return String.valueOf(n1/n2);
        } else {
            return "Error";
        }
    }
}
