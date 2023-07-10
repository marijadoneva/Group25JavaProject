package tuyana.week6;

import java.util.Scanner;



public class String_PasswordValidation {
    public static boolean isValidPassword(String password) {
        // 1. Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        // 2. PassWord should at least contain one upper-case letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        //3. PassWord should at least contain one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // 4. Password should at least contain one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        // 5. Password should at least contain a digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String password = "TuyanaChi93!";
        boolean isValid = isValidPassword(password);
        System.out.println(isValid);
    }
}

/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */