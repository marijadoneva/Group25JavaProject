package Hannah;


    public class Week07_SortAscending {
        public static int[] sortAscending(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return arr;  // Array is already sorted or empty, no need to sort
            }

            // Implementing Bubble Sort algorithm
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap elements arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {10, 9, 8, 7};
            arr = sortAscending(arr);
            for (int num : arr) {
                System.out.print(num + " ");  // Output: 7 8 9 10
            }
        }
    }
/*
Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

In this code, we use the Bubble Sort algorithm to sort the integer array in ascending order. We iterate over the array multiple times, comparing adjacent elements and swapping them if they are in the wrong order. The largest element gradually "bubbles" up to the end of the array in each iteration. This process is repeated until the array is sorted. The main method demonstrates the usage of this method with the given example array.





 */


