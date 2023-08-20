package tuyana.week8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayN_unique {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int value");
        int arrayN = scn.nextInt();


        System.out.println(Arrays.toString(Solution(arrayN)));
    }

    public static int[] Solution(int N){
        int[] result = new int[N];
        int sum = 0;
        for(int i = 0; i < N-1; i++){
            result[1] = i;
            sum += i;
        }
        result[N-1]= - sum;
        return result;

    }



}
