package Hannah;

public class Week01_Finra {

    public static void printfinra() {
        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FINRA");
            } else if (number % 3 == 0) {
                System.out.println("FIN");
            } else if (number % 5 == 0) {
                System.out.println("RA");
            } else {

                System.out.println(number + " ");


                }
            }
            }

    public static void main(String[] args) {
       printfinra();
    }
}



/*

 3 - FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */

