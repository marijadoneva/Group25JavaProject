package Hannah;
import java.util.ArrayList;
import java.util.List;
public class Week09_RemoveSomeValueGreaterThan100 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(101);
        numbers.add(6);
        numbers.add(102);
        numbers.add(103);

        System.out.println("Original list: " + numbers);

        // Remove all values greater than 100
        numbers.removeIf(num -> num > 100);

        System.out.println("List after removing values greater than 100: " + numbers);
    }
}

/*
In this code, we create an ArrayList named numbers and add several Integer values to it, including some values greater than 100. We then use the removeIf method with the lambda expression num -> num > 100 to remove all elements from the list that are greater than 100.

        The output of the above code will be:

        less
        Copy code
        Original list: [1, 2, 3, 4, 101, 6, 102, 103]
        List after removing values greater than 100: [1, 2, 3, 4, 6]
        As you can see, all values greater than 100 have been removed from the ArrayList, and the resulting list contains only the values 1, 2, 3, 4, and 6.
*/



