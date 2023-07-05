package Haden;

import java.util.Scanner;

public class Week06_Q01 {

    public static void main(String[] args) {

        /**
         Write a method that can return the sum of the digits in a string
         Ex:  "12 java 5 apple 3"  ==>  20
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String value with numbers");
        String str = scn.nextLine();

        System.out.println(sumOfDigits(str));

        scn.close();

    }

   // Solution:
    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

}
