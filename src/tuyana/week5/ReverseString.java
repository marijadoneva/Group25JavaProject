package tuyana.week5;

public class ReverseString {
    public static void main(String[] args) {


        String reverse = "ABCD", nstr = "";
        char ch;

        System.out.println("Original word: ");
        System.out.println("ABCD");

        for(int i =0; i < reverse.length(); i++){
            ch = reverse.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);




    }
}

/*

Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA

 */
