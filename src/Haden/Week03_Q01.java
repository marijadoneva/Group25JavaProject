package Haden;

import java.util.Scanner;

public class Week03_Q01 {


    public static void main(String[] args) {


        /**
         Write a method that can check if a number is prime or not
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scn.nextInt();
        System.out.println(primeNumber(num));

    }

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println(num + " is not a prime number");
                return false;
            }
        }
        System.out.println(num + " is not a prime number");
        return true;
    }

    // Second Solution
    public static boolean isPrime(int n) {
        // If n is less than 2, it is not prime
        if (n < 2) {
            return false;
        }
        // Check if n is divisible by any number from 2 to its square root
        for (int i = 2; i * i <= n; i++) {
            // If n is divisible by i, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // If none of the above conditions are met, n is prime
        return true;
    }

}
