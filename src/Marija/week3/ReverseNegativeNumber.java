package Marija.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a negative number");
        int number = input.nextInt();
        ReverseNegative(number);

        System.out.println("Please enter a negative number");
        number = input.nextInt();
        ReverseNegative(number);


        input.close();
    }

    public static int ReverseNegative(int a){
        int b=0;

        a*=-1;//35
        String abc="";
        String num = ""+a;

        for (int i = num.length()-1; i >=0; i--) {

            char each = num.charAt(i);
            abc+=each;
        }

        b=Integer.valueOf(abc);
        b*=-1;

        System.out.println(b);
        return b;
    }

}


/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */