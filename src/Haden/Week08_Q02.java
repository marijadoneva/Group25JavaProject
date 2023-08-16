package Haden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week08_Q02 {

    public static void main(String[] args) {

        /**
         Array - Move Zeros to the End
         Write a method that can move all the zeros to last indexes of the array (Do
         Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
         0]
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array numbers");

        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(moveZeros(arr)));

    }

    public static int[] moveZeros( int[]  arr ) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for(int each: arr) {
            list.add(each);
            countZero+= (each==0)?1:0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
