package Hannah;

public class Week03_PrimeNumbers {
    public static class PrimeNumberChecker {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPrime(7));   // true
            System.out.println(isPrime(12));  // false
        }
    }

}
/*
**Numbers -- PrimeNumber**
Write a method that can check if a number is prime or not


**Numbers -- Reverse Negative Number**
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */