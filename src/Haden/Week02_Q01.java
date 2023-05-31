package Haden;

public class Week02_Q01 {

    public static void main(String[] args) {

        /**
         Swap two variables' values without using a third variable
         */

//        Solution 1:
        int a = 10;
        int b  = 20;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        Solution 2:
        int aa = 10;
        int bb  = 20;

        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;

        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
    }

}
