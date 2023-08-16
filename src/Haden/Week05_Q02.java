package Haden;

import java.util.Scanner;

public class Week05_Q02 {

    public static void main(String[] args) {

        /**
         Write a return method that can reverse  String
         Ex: Reverse("ABCD"); ==> DCBA
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String value");
        String str = scn.nextLine();

        System.out.println(StrReverse(str));
        System.out.println(Reverse(str));

        scn.close();
    }

  //  Solution 1
    public static String StrReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return  reverse;
    }

  //  Solution 2
    public  static String  Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
