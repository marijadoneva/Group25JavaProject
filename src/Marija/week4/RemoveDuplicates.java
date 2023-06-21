package Marija.week4;

public class RemoveDuplicates {
    public static void main(String[] args) {

        removeDuplicate("AAABBBCCC");
        removeDuplicate("aaaaaaxxxxxsdqqqd");

    }

    public static String removeDuplicate(String word){
        String result = "";

        for (int i = 0; i < word.length()-1; i++) {
              String letter = word.charAt(i)+"";
            if (!result.contains(letter)) {
                result+=letter;
            }else {
                continue;
            }

        }


        System.out.println("result = " + result);

        return result;
    }
}

/*
   String - Remove Duplicates
        Write a return method that can remove the duplicated values from the String
          Ex: removeDup("AAABBBCCC") ==> ABC
 */