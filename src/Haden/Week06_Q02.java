package Haden;

import java.util.Scanner;

public class Week06_Q02 {

    public static void main(String[] args) {

        /**
         1. Write a return method that can verify if a password is valid or not.
         requirements:
         1. Password MUST be at least have 6 characters and should not contain space
         2. PassWord should at least contain one upper-case letter
         3. PassWord should at least contain one lowercase letter
         4. Password should at least contain one special character
         5. Password should at least contain a digit
         if all requirements above are met, the method returns true, otherwise returns  false
         */


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String str = scn.nextLine();

        System.out.println(PassWordvalidation(str));
        System.out.println(validPassword(str));

        scn.close();

    }

   // Solution 1:
    public static boolean PassWordvalidation(String password) {
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }

    // Solution 2
    public static boolean validPassword(String password) {

        if ((password.length() < 6) ||
                (password.contains(" ")) ||
                (!password.matches(".*[A-Z].*")) ||
                (!password.matches(".*[a-z].*")) ||
                (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) ||
                (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }


}
