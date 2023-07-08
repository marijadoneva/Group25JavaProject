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

