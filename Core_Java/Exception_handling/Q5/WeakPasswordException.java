package Exception_handling.Q5;

public class WeakPasswordException extends Exception {
    public WeakPasswordException() {
        super("Your password is weak");
    }
}
