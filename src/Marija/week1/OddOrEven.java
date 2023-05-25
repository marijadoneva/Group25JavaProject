package Marija.week1;

public class OddOrEven {


    public static void main(String[] args) {


        identify(5);
        identify(6);

}


    public static void identify(int num){

        if (num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
/*
 1 - Numbers- Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */