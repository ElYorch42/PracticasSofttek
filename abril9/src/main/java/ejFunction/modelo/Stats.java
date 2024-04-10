package ejFunction.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stats {

    private double minimo;
    private double maximo;
    private double media;

    public void comprobarMinimo(ArrayList<Double> lista) {
        double min = 0;
        for (double num: lista) {
            for (double num2: lista) {
                if (num2<num) {
                    min = num2;
                }
            }
        }
        minimo = min;
    }

    public void comprobarMaximo(ArrayList<Double> lista) {
        double max=0;
        for (double num: lista) {
            for (double num2: lista) {
                if (num2>num) {
                    max = num2;
                }
            }
        }
        minimo = max;
    }

    public void hacerMedia(ArrayList<Double> lista) {
        double med =0;
        for (int i = 0; i < lista.size() ; i++) {
            med += lista.get(i);
        }
        media = med/lista.size();
    }

}
