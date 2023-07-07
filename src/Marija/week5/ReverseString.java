package Marija.week5;

public class ReverseString {
    public static void main(String[] args) {

        reverse("ABCD");
        reverse("Marija");

    }

    public static String reverse(String word){
        String reverseWord="";

        for (int i = word.length()-1; i>=0 ; i--) {
            reverseWord+= word.charAt(i);
        }

        System.out.println(reverseWord);

        return reverseWord;
    }
}

/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */