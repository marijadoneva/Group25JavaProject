package PrimeNumber;

public class NegativeNumberReverser {
    public static int ReverseNegative (int number) {
        if(number >= 0){
            return number;
        }
        number = Math.abs(number);
        StringBuilder reversedString = new StringBuilder(Integer.toString(number)).reverse();
        int reversedNumber = Integer.parseInt(reversedString.toString());
        return -reversedNumber;
    }
}


