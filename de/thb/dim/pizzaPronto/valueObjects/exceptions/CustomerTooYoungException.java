public class CustomerTooYoungException extends Exception {
    public CustomerTooYoungException() {
        super("Customer is too young.");
    }

    public CustomerTooYoungException(String message) {
        super(message);
    }
}
