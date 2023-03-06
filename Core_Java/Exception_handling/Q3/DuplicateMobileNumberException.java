package Exception_handling.Q3;

public class DuplicateMobileNumberException extends Exception {
    public DuplicateMobileNumberException() {
        super("Mobile number and alternate mobile number are same");
    }
}
