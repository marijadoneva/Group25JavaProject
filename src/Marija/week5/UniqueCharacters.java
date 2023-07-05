package Marija.week5;

public class UniqueCharacters {
    public static void main(String[] args) {

        unique("AAABBBCCCDEF");
        unique("cydeothecydeo");
    }


    public static String unique(String word){
        String uniqueChar="";

        for (int i = 0; i<=word.length()-1 ; i++) {
            String uniq = word.charAt(i)+"";
           if(word.indexOf(uniq)==word.lastIndexOf(uniq)){
               uniqueChar+=uniq;
           }

        }

        System.out.println(uniqueChar);

        return uniqueChar;
    }



}


/*
1. Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */