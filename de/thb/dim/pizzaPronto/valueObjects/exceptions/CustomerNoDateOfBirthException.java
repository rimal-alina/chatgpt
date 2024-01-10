public class CustomerNoDateOfBirthException extends Exception {
    public CustomerNoDateOfBirthException() {
        super("There is no date of birth available.");
    }

    public CustomerNoDateOfBirthException(String message) {
        super(message);
    }
}
