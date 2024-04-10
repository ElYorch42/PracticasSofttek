package ejpredicado.vista;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> positivos = x -> x >0;
        if (positivos.test(5)) {
            System.out.println("positivo");
        }

        Predicate<String> cadenas = x -> x.isEmpty();
        if (cadenas.test("")) {
            System.out.println("esta vacio");
        } else {
            System.out.println("no esta vacio");
        }

        Predicate<Integer> pares = x -> x%2==0;
        if (pares.test(4)) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }

        Predicate<Integer> mayores = x -> x> 10;
        if (mayores.test(12)) {
            System.out.println("el numero es mayor");
        } else {
            System.out.println("el numero es menor");
        }

        Predicate<Integer> primos = x -> isPrime(x);
        if (primos.test(7)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if((n% i) == 0) {
                return false;
            }
        }
        return true;
    }

}
