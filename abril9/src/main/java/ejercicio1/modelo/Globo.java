package ejercicio1.modelo;

import lombok.Data;

@Data
public class Globo {

    public static int contador=1;
    private final int ID;

    public Globo() {
        this.ID = contador++;
    }
}
