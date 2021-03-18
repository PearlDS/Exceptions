package cars;

public class TooFastException extends Exception {

    public TooFastException() {

    }

    public TooFastException(String message) {
        super(message);
    }
}
