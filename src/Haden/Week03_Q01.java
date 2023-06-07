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

        return true;

    }



}
