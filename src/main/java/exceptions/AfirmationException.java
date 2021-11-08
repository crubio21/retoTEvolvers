package exceptions;

public class AfirmationException extends AssertionError {

    public static final String TEST_ERROR_EXCEPTION = "El texto en pantalla no corresponde al esperado";

    public AfirmationException(String message, Throwable cause) {
        super(message, cause);
    }
}