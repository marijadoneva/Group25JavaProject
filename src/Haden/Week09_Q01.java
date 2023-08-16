package Haden;

import java.util.Arrays;

public class Week09_Q01 {

    public static void main(String[] args) {

        /**
         Array - Concate two arrays
         Write a return method that can concate two arrays
         */

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));

    }

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1) {
            result[i] = each;
            i++;
        }
        for(int each: arr2) {
            result[i] =each;
            i++;
        }
        return result;
    }
}
