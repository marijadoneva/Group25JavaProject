package Haden;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Week04_Q03 {


    public static void main(String[] args) {

        /**
         Write a return method that can remove the duplicated values from String
         Ex:  removeDup("AAABBBCCC")  ==> ABC
         */

    }

  //  Solution 1:
    public static  String  removeDup( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

  //  Solution 2:
    public static String removeDup_1(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }



}
