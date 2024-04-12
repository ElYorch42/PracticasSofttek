package Ej1.vista;

import Ej1.modelo.Producto;
import Ej1.persistencia.AccesoProducto;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        mostrarListaCategoriaDos();
        mostrarListaProductosEmpiezanConN();
        ordenarProductosAscNombre();
        obtenerProductoPrecioMax();
        promedioPreciosProductos();
        obtenerCategoriasYCantidad();

    }

    public static void mostrarListaCategoriaDos() {
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            List<Producto> categoria2 = listaProductos.stream().filter(productos -> productos.getIdCategoria() == 2).collect(Collectors.toList());

            categoria2.forEach(System.out::println);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public static void mostrarListaProductosEmpiezanConN() {
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            List<Producto> nombreConN = listaProductos.stream().filter(productos -> productos.getNombreProducto().startsWith("N")).collect(Collectors.toList());

            nombreConN.forEach(System.out::println);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public static void ordenarProductosAscNombre() {
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            List<Producto> productosOrdenados = listaProductos.stream().sorted(Comparator.comparing(Producto::getNombreProducto).reversed()).collect(Collectors.toList());

            productosOrdenados.forEach(System.out::println);
        }
        catch(ClassNotFoundException |
                SQLException e)
        {
            System.out.println(e);
        }
    }

    public static void obtenerProductoPrecioMax(){
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            Producto productoPrecioMax = listaProductos.stream().max(Comparator.comparing(Producto::getPrecioUnitario)).get();

            System.out.println(productoPrecioMax);
        }
        catch(ClassNotFoundException |
                SQLException e)
        {
            System.out.println(e);
        }
    }
    public static void obtenerCategoriasYCantidad(){
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            Map<Integer, Long> cantidadPorCategoria = listaProductos.stream()
                    .collect(Collectors.groupingBy(Producto::getIdCategoria, Collectors.counting()));

            cantidadPorCategoria.forEach((categoria, cantidad) ->
                    System.out.println("Categoría " + categoria + ": " + cantidad + " productos"));

        }
        catch(ClassNotFoundException |
                SQLException e)
        {
            System.out.println(e);
        }
    }

    public static void promedioPreciosProductos(){
        AccesoProducto aP1 = new AccesoProducto();

        try {
            List<Producto> listaProductos = aP1.obtenerTodos();

            double promedioPrecios = listaProductos.stream().mapToDouble(Producto::getPrecioUnitario).average().orElse(0);

            System.out.println("El promedio de los precios es: "+promedioPrecios);
        }
        catch(ClassNotFoundException |
                SQLException e)
        {
            System.out.println(e);
        }
    }
}
