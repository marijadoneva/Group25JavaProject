package Hannah;

import static Hannah.Week6_JavaCodingTask.DigitSum.sumOfDigits;

public class Week6_JavaCodingTask {
    public static class DigitSum {
        public static int sumOfDigits(String string) {
            int digitSum = 0;
            for (char c : string.toCharArray()) {
                if (Character.isDigit(c)) {
                    digitSum += Character.getNumericValue(c);
                }
            }
            return digitSum;
        }
    }

    public static void main(String[] arg) {
        String string = "12 java 5 apple 3";
        int result = sumOfDigits(string);
        System.out.println(result);
    }
}








