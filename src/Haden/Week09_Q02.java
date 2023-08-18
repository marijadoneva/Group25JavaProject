package Haden;

import java.util.*;

public class Week09_Q02 {

    public static void main(String[] args) {

        /**
         ArrayList - Remove "Ahmed"
         Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
         Write a java operation to remove all the names named Ahmed
         */

        // Solution 1:
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names);

        // Solution 2:
        List<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        for (ListIterator<String> it = names1.listIterator(); it.hasNext(); )
            if (it.next().equals("Ahmed"))
                it.remove();

        System.out.println(names1);


        //  Solution 3:
        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        List<String> names2_1 = new ArrayList<>();
        names2.forEach(p -> {
            if (!p.equals("Ahmed")) names2_1.add(p);
        });

        System.out.println(names2_1);


        // Solution 4:
        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        Iterator<String> it = names3.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println(names3);

    }
}
