package tuyana.week7;

import java.util.Arrays;

public class Array_SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));




    }
}

/*
Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */
