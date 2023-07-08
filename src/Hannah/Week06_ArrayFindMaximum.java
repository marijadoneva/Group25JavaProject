package Hannah;

public class Week06_ArrayFindMaximum {

        public static int findMaximum(int[] arr) {
            if (arr.length == 0) {
                throw new IllegalArgumentException("Array must not be empty.");
            }

            int max = arr[0]; // Assume the first element is the maximum

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // Update the maximum if a larger element is found
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            int maximum = findMaximum(arr);
            System.out.println(maximum); // Output: 99
        }
    }



/*
**Array_FindMaximum**
```
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
```
 */