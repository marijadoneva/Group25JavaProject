package Hannah;
public class Week07_SortDescending {
    public static int[] sortDescending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;  // Array is already sorted or empty, no need to sort
        }

        // Implementing Bubble Sort algorithm
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
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
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);
        for (int num : arr) {
            System.out.print(num + " ");  // Output: 90 20 10 8 7
        }
    }
}

/*
Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};
 */

