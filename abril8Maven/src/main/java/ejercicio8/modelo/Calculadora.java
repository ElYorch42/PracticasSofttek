package ejercicio8.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Calculadora {
    private double num1;
    private double num2;
    private String operando;

    public boolean introducirOperando(String operando) {
        return operando.equals("+") || operando.equals("-") || operando.equals("/") || operando.equals("*");
    }
    public String calcular() {
        String resultado;
        switch (operando) {
            case "+":
                resultado = String.valueOf(num1+num2);
                break;
            case "-":
                resultado = String.valueOf(num1-num2);
                break;
            case "*":
                resultado = String.valueOf(num1*num2);
                break;
            case "/":
                try {
                    if (num2 == 0) {
                        throw new CalculadoraException("Error numero 2 igual a 0");
                    } else {
                        resultado = String.valueOf(num1/num2);
                    }
                } catch (CalculadoraException e){
                    resultado = e.getMessage();
                }
                break;
            default:
                resultado = "Error";
                break;
        }
        return resultado;
    }

}
