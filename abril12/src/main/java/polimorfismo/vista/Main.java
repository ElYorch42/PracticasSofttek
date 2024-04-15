package polimorfismo.vista;

import polimorfismo.modelo.Factura;
import polimorfismo.modelo.IvaGeneral;
import polimorfismo.modelo.IvaSuperReducido;
import polimorfismo.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("pescado",3);
        Producto p2 = new Producto("platano",1);
        Producto p3 = new Producto("ordenador",5);

        List<Producto> listaProductos= new ArrayList<>();

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        IvaGeneral ivaGeneral=new IvaGeneral();
        IvaSuperReducido ivaSuperReducido=new IvaSuperReducido();

        Factura facturaGeneral = new Factura(ivaGeneral,listaProductos);
        Factura facturaReducida = new Factura(ivaSuperReducido,listaProductos);

        System.out.println("Factura general: "+facturaGeneral.calcularFactura());
        System.out.println("Factura reducida: "+facturaReducida.calcularFactura());
    }

}
