package dec16.basicExceptions.bank;

public class InsufficientsFundsException extends RuntimeException{

    public InsufficientsFundsException(String message) {
        super(message);
    }
}
