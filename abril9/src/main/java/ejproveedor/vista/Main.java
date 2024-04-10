package ejproveedor.vista;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> aleatorio = () -> Math.toIntExact(Math.round(Math.random()*5));
        System.out.println(aleatorio.get());

        Supplier<ArrayList<String>> lista = () -> {
            ArrayList arrayList = new ArrayList();
            arrayList.add("obj1");
            arrayList.add("obj2");
            arrayList.add("obj3");
            return arrayList;
        };
        for (String item:lista.get()) {
            System.out.println(item);
        }

        Supplier<LocalDateTime> fecha = () -> LocalDateTime.now();
        System.out.println(fecha.get());

        Supplier<String> vacio = () -> {
            return "";
        };
        System.out.println(vacio.get());


    }
}
