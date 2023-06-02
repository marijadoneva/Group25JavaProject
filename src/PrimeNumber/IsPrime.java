package PrimeNumber;

public class IsPrime {
    public static boolean IsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
            return true;
    }
    }







