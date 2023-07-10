package tuyana.week7;

import java.util.Arrays;

public class Array_SortDescending {
    public static void main(String[] args) {
        int[] array = {10,20,7, 8, 90};

        int[] reverse = new int[array.length];

        for(int i = array.length - 1, j=0; i >= 0; i--){
            reverse[j++] = array[i];
        }
        System.out.println(Arrays.toString(reverse));




    }
}
/*
 Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */
