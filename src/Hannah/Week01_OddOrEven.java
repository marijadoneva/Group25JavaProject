package Hannah;
import java.util.*;
public class Week01_OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        //WRITE YOUR CODE BELOW

       if( number % 2 ==0){
            System.out.println(number + " is even");

        }else{
           System.out.println(number + " is odd");
            }


        }



    }

/*

 1 - Numbers_ Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */
