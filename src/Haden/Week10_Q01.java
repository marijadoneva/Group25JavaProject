package Haden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week10_Q01 {

    public static void main(String[] args) {


        /**
         Write a method that can sort the ArrayList in Ascending order without using the sort method
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(4,11,5,3,1,77,12,15));

        SortingArrayListAsc(list);

    }

    public static void SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

}
