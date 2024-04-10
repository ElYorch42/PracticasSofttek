package ejercicio1.vista;

import ejercicio1.modelo.Globo;

public class Main {
    public static void main(String[] args) {
        System.out.println("contador:"+Globo.contador);
        Globo globo1 = new Globo();
        System.out.println(globo1);
        System.out.println("contador:"+Globo.contador);
        Globo globo2 = new Globo();
        System.out.println(globo2);
        System.out.println("contador:"+Globo.contador);
        Globo globo3 = new Globo();
        System.out.println(globo3);
        System.out.println("contador:"+Globo.contador);

    }
}
