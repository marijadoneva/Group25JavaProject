package Hannah;

import java.util.Arrays;

public class Week09_Concat_TwoArrays {

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1 + len2];

        // Copy elements from the first array (arr1) to the result array
        for (int i = 0; i < len1; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array (arr2) to the result array
        for (int i = 0; i < len2; i++) {
            result[len1 + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] concatenatedArray = concatArrays(arr1, arr2);
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
    }
}
/*
Array - Concat two arrays
Write a return method that can concat two arrays

In this example, we have the two input arrays arr1 and arr2. The concatArrays method takes these two arrays as parameters, creates a new array result with the combined size of arr1 and arr2, and then copies the elements from both arrays into the result array. The resulting array will be the concatenation of the two input arrays.

For the provided example, the output will be:

Concatenated array: [1, 2, 3, 4, 5, 6]


 */



