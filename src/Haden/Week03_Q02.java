package Haden;

import java.util.Scanner;

public class Week03_Q02 {


    public static void main(String[] args) {

        /**
         Write a return method that can reverse negative number and return it as int
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a negative number");
        int num = scn.nextInt();
        System.out.println(reverseNum(num));

        System.out.println(reverseNegative(num));

        scn.close();

    }
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }

    // A method that can reverse digits of a negative number and return it as int
    public static int reverseNegative(int n) {
        // If n is not negative, return n as it is
        if (n >= 0) {
            return n;
        }
        // Make n positive by multiplying it by -1
        n = n * -1;
        // Convert n to a string and reverse it using StringBuilder
        String s = new StringBuilder(String.valueOf(n)).reverse().toString();
        // Convert s back to an int and multiply it by -1 to restore the sign
        int result = Integer.parseInt(s) * -1;
        // Return the result
        return result;
    }

}
