package Haden;

import java.util.Arrays;
import java.util.Scanner;

public class Week06_Q03 {

    public static void main(String[] args) {

        /**
         Write a method that can find the maximum number from an int Array
         Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 numbers");

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(maxValue(arr));
        System.out.println(maxValue_1(arr));

        scn.close();

    }


   // Solution 1:
    public static int maxValue( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;

        return min;
    }

   // Solution 2:
    public static int maxValue_1( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }

}
