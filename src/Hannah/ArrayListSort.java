package Hannah;


import java.util.ArrayList;

public class ArrayListSort {
        public static void bubbleSort(ArrayList<Integer> list) {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        // Swap elements at j and j+1
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(9);
            numbers.add(1);
            numbers.add(5);

            System.out.println("Before sorting: " + numbers);

            bubbleSort(numbers);

            System.out.println("After sorting: " + numbers);
        }
    }

