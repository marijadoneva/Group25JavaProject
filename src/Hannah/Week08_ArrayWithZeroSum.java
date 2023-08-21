package Hannah;

import java.util.Arrays;

public class Week08_ArrayWithZeroSum {
    public static int[] generateArrayWithZeroSum(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 2 and 99");
        }
        int[] result = new int[N];

        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
            sum += result[i];

        }
        result[N - 1] = -sum;
        return result;
    }
        public static void main(String[] args) {
        int N = 4;
        int[] result = generateArrayWithZeroSum(N);
        System.out.println("Array with zero sum:");
        System.out.println(Arrays.toString(result));
    }

}





