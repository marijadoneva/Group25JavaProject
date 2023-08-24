package Haden;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Week11_Q02 {

    public static void main(String[] args) {

        /**
         Write a method that can return the minimum value from a map (DO NOT use sort method)
         */

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Aa", 355);
        map.put("Bb", 155);
        map.put("Cc", 15);
        map.put("Dd", 255);
        map.put("Ee", 555);
        map.put("Ff", 505);
        map.put("Gg", 95);

        System.out.println(minValue(map));

    }

    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }

}
