package Yassine;

public class Week01Q01 {

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
   /*    int number = 5;
     //  int number1 = 6;

        boolean isEven =  number % 2 == 0;

        // boolean isOdd = number % 2 != 0;

        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);
*/
        System.out.println("----------------------------------");

        System.out.println(identify(5));

    }
}





