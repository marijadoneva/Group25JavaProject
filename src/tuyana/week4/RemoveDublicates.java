package tuyana.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicates {
    public static void main(String[] args) {

       String str = "AAABBBCCC";

       String result = "";
       for(int i = 0; i < str.length(); i++){
           char each = str.charAt(i);
           if(!result.contains("" + each)){
               result+= each;
           }
       }
        System.out.println(result);




    }

}


/*
String - Remove Duplicates
       Write a return method that can remove the duplicated values from the String
         Ex: removeDup("AAABBBCCC") ==> ABC
 */