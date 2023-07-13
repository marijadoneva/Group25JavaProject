package Haden;

import java.util.Arrays;
import java.util.Scanner;

public class Week07_Q01 {

    public static void main(String[] args) {

        /**
         Write a method that can find the minimum number from an int Array
         Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 7 numbers");

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(minValue(arr));
        System.out.println(minValue_01(arr));

        scn.close();

    }

   // Solution 1:
    public static int minValue( int[]  n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n)
            if(each < min)
                min = each;

        return min;
    }

   // Solution 2:
    public static int minValue_01( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }

}
