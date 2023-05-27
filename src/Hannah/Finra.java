package Hannah;

public class Finra {

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





