package ejercicio7.modelo;

public class ProductoException extends Exception{

    private String mensajeError;

    public ProductoException(String message) {
        super(message);
    }

    public ProductoException() {
    }
}
