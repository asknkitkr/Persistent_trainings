package Exception_handling.Q5;

public class UserBO {
    public static void validate(User u) throws WeakPasswordException {
        String password = u.getPassword();
        int len = password.length();

        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasLetter = false;

        for (int i = 0; i < len; i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                hasSpecialChar = true;
            } else if (Character.isLetter(ch)) {
                hasLetter = true;
            }
        }

        if (len < 10 || len > 20 || !hasDigit || !hasLetter || !hasSpecialChar) {
            throw new WeakPasswordException();
        }
    }
}
