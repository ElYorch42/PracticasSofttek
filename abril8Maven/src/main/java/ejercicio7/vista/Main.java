package ejercicio7.vista;

import ejercicio7.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(2,"manzana",1.5,"mercadona","es una manzana");
        Producto producto2 = new Producto();

        System.out.println(producto1.comprobar());
        System.out.println(producto2.comprobar());
    }
}
