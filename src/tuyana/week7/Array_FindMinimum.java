package tuyana.week7;

public class Array_FindMinimum {
    public static void main(String[] args) {
        int[] numbers = {99, 12, 23, 32, 44, 57, 6};

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max ){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }



}

/*
  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
