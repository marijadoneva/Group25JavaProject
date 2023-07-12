package Haden;

public class Week01_Q02 {

    /**
     Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(1550, 3.3));

    }

    public static int divideWithoutOperator(double dividend, double divisor) {

        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Determine the sign of the result
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        // Convert the numbers to positive to simplify the calculation
        double absDividend = Math.abs(dividend);
        double absDivisor = Math.abs(divisor);

        // Perform the division
        int quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }

        // Apply the sign to the result
        quotient *= sign;

        return quotient;
    }

}
