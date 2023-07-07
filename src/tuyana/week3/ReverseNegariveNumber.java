package tuyana.week3;

public class ReverseNegariveNumber {

   public static void main(String[] args) {

      int input = -35;
      int output = reverseInteger(-35);
      System.out.println("Input : " + input + " Output : " + output);



   }

   private static int reverseInteger(int number) {
      boolean isNegative = number < 0 ? true : false;
      if(isNegative){
         number = number * -1;
      }
      int reverse = 0;
      int lastDigit = 0;

      while(number >= 1){
         lastDigit = number % 10;
         reverse = reverse * 10 + lastDigit;
         number = number / 10;
      }
      return isNegative == true? reverse*-1 : reverse;
   }

}

/*

**Numbers -- Reverse Negative Number**
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
