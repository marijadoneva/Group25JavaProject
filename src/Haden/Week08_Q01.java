package Haden;

import java.util.Arrays;
import java.util.Scanner;

public class Week08_Q01 {

    public static void main(String[] args) {

        /**
         Array - N unique integers that sum up to 0
         Write a function that given an integer N (1 < N < 100), returns an array
         containing N unique integers that sum up to 0. The function can return any
         such array.
         For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
         The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
         For N = 3 one of the possible answers is [-1,0,1] (but there are many more
         correct answers).
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int value");
        int valueN = scn.nextInt();

        System.out.println(Arrays.toString(Solution(valueN)));
    }

    public static int[] Solution(int N){
        int[] result = new int[N];  //4
        int sum = 0;
        for(int i=0; i < N-1; i++) { // 0, 1, 2
            result[i] =i;  //  [0, 1, 2, -3]
            sum += i; // 3
        }
        result[N-1] = -sum; //3
        return result;
    }

}
