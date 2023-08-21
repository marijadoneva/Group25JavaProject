package Hannah;

import java.util.Arrays;

public class Week08_MoveZeroToEnd {

    public static void moveZerosToEnd(int[] arr) {
            int nonZeroPointer = 0;

            // Move all non-zero elements to the left
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[nonZeroPointer] = arr[i];
                    nonZeroPointer++;
                }
            }

            // Fill the remaining positions with zeros
            while (nonZeroPointer < arr.length) {
                arr[nonZeroPointer] = 0;
                nonZeroPointer++;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
            System.out.println("Input array: " + Arrays.toString(arr));

            moveZerosToEnd(arr);

            System.out.println("Output array: " + Arrays.toString(arr));
        }
    }
/*

**Week 9**

```Array - Concat two arrays
Write a return method that can concat two arrays

The method moveZerosToEnd takes an array as input and moves all the non-zero elements to the left, and then fills the remaining positions with zeros. The original order of non-zero elements is preserved, and the zeros are moved to the end of the array. The output for the provided example will be [1, 2, 3, 4, 0, 0, 0, 0].
 */
