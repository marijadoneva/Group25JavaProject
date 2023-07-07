package Hannah;


    public class Week07_FindMinimum {
        public static int findMin(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }

            int min = arr[0];  // Assume the first element is the minimum

            // Iterate over the array starting from the second element
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];  // Update the minimum if a smaller element is found
                }
            }

            return min;
        }

        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            int minimum = findMin(arr);
            System.out.println(minimum);  // Output: 6
        }
    }

