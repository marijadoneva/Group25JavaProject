package Hanan;

public class NumberPrinter {
        public static void printNumbers(int N) {
            for (int num = 1; num <= N; num++) {
                String output = "";
                if (num % 2 == 0) {
                    output += "Codility";
                }
                if (num % 3 == 0) {
                    output += "Test";
                }
                if (num % 5 == 0) {
                    output += "Coders";
                }
                if (output.isEmpty()) {
                    output = Integer.toString(num);
                }
                System.out.println(output);
            }
        }

        public static void main(String[] args) {
            int N = 17;
            printNumbers(N);
        }
    }


