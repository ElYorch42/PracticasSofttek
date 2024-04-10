package ejFunction.vista;

import ejFunction.modelo.Stats;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<ArrayList<Integer>,ArrayList<Integer>> lista = x -> {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) %2 !=0) {
                    x.remove(i);
                }
            }
            return x;
        };
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(21);
        a.add(8);
        a.add(7);
        System.out.println(lista.apply(a));

        Function<ArrayList<Double>, Stats> pares = x ->{
          Stats stats = new Stats();
          stats.comprobarMinimo(x);
          stats.comprobarMaximo(x);
          stats.hacerMedia(x);
          return stats;
        };
        ArrayList<Double> b = new ArrayList<>();
        a.add(11);
        a.add(22);
        a.add(9);
        a.add(6);
        System.out.println(pares.apply(b));

        if (contra("contraseña")) {
            System.out.println("esta bien");
        }
    }

    public static boolean contra(String cadena) {

        Function<String, Boolean> lengitud = x -> x.length() >= 8;

        Function<String, Boolean> contraMas = x -> {
            boolean si = false;
            for (int i = 0; i < x.length(); i++) {
                if (Character.isUpperCase(x.charAt(i))) {
                    si = true;
                    break;
                }
            }
            return si;
        };

        Function<String, Boolean> contraMenos = x -> {
            boolean si = false;
            for (int i = 0; i < x.length(); i++) {
                if (Character.isLowerCase(x.charAt(i))) {
                    si = true;
                    break;
                }
            }
            return si;
        };

        Function<String, Boolean> contraNum = x -> {
            boolean si = false;
            for (int i = 0; i < x.length(); i++) {
                if (Character.isDigit(x.charAt(i))) {
                    si = true;
                    break;
                }
            }
            return si;
        };

        Function<String, Boolean> contraEspecial = x -> {
            boolean si = false;
            for (int i = 0; i < x.length(); i++) {
                if (!Character.isUpperCase(x.charAt(i)) && !Character.isLowerCase(x.charAt(i)) && !Character.isDigit(x.charAt(i))) {
                    si = true;
                    break;
                }
            }
            return si;
        };

        return lengitud.apply(cadena) && contraMas.apply(cadena) && contraMenos.apply(cadena) && contraEspecial.apply(cadena);
    }
}
