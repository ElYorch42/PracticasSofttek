package ejemploHashmap.vista;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("clave1","valor1");
        hashMap.put("clave2","valor2");
        hashMap.put("clave3","valor3");
        hashMap.put("clave4","valor1");

        System.out.println(hashMap);

        hashMap.remove("clave4");
        hashMap.replace("clave3","valorDistinto");
        System.out.println(hashMap);
        System.out.println("tamaño:"+hashMap.size());

        if (hashMap.containsKey("clave2")) {
            System.out.println("la clave 2 existe");
        }
        if (!hashMap.containsKey("clave5")) {
            System.out.println("la clave 5 no existe");
        }

        System.out.println("el valor de la clave3 es:"+hashMap.get("clave3"));

        hashMap.clear();
        System.out.println(hashMap);

    }
}
