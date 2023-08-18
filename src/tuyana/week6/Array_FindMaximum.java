package tuyana.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(99, 12, 23, 32, 44, 57, 6));

        int max = list.get(0);
        for(Integer each : list){
            if(each > max){
                max = each;
            }
        }

        System.out.println("max num: " + max);
    }


}

/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */