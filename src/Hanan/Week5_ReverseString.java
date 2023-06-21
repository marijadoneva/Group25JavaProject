package Hanan;

public class Week5_ReverseString {

    public static void main(String[] args) {

        String chars ="ABCD";
        String reverseChars="";

        for (int i = chars.length() - 1; i >= 0; i--) {
            reverseChars += chars.charAt(i);
        }

        System.out.println(reverseChars);

    }

}


/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */

