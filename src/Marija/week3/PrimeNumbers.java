package Marija.week3;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        prime(num);

        System.out.println("Enter a number:");
        num= input.nextInt();
        prime(num);



        input.close();
    }
    public static void prime(int num){



        int primeNumbers=0;


        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {  //5/1=5 5/2=2.343
                ++primeNumbers;
            }
        }
            if (primeNumbers==2){
                System.out.println(num+ " it's a prime number");
            }else {
                System.out.println(num + " it's not a prime number");
            }


    }
}
/*
Write a method that can check if a number is prime or not

 */