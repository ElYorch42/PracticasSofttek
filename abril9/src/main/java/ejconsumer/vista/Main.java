package ejconsumer.vista;

import ejconsumer.modelo.Producto;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> mayus = x -> System.out.println(x.toUpperCase());
        mayus.accept("hola");

        Consumer<Integer> cuadrado = x->
            System.out.println("numero:"+x+" cuadrado:"+Math.pow(x,2));
        cuadrado.accept(4);

        Producto producto = new Producto("manzana",1.5,"es una manzana");
        Consumer<Producto> productoConsumer = x->
                System.out.println("nombre:"+x.getNombre()+" precio:"+x.getPrecio()+" decripcion:"+x.getDesc());
        productoConsumer.accept(producto);

        Consumer<String> mensaje = x-> JOptionPane.showMessageDialog(null,x);
        mensaje.accept("mensaje");

        Consumer<String> registro = x-> {
            File archivo = new File("./log.txt");

            try {
                archivo.createNewFile();
                FileWriter fileWriter = new FileWriter("src/main/java/ejconsumer/vista/log.txt");
                fileWriter.write(x);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        registro.accept("Texto registro");
    }
}
