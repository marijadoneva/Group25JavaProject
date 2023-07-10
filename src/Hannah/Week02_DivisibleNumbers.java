package Hannah;
public class Week02_DivisibleNumbers {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        String section15 = "Divisible by 15";
        String section5 = "Divisible by 5";
        String section3 = "Divisible by 3";
        for (int num = 1; num <= 100; num++) {
            if (num % 15 == 0) {
                section15 = section15 + " " + num;
            } else if (num % 5 == 0) {
                section5 = section5 + " " + num;
            } else if (num % 3 == 0) {
                section3 = section3 + " " + num;
            }

        }
        System.out.println(section15);
        System.out.println(section5);
        System.out.println(section3);
    }
}


