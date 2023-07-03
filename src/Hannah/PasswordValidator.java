package Hannah;



public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Requirement 1: Password length and no space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Requirement 3: Contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Requirement 4: Contains at least one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        // Requirement 5: Contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // All requirements met
        return true;
    }

    public static void main(String[] args) {
        String password = "SecurePass123!";
        boolean isValid = isValidPassword(password);
        System.out.println(isValid);  // Output: true
    }
}



