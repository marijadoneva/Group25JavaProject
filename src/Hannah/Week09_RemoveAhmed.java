package Hannah;

import java.util.ArrayList;
import java.util.List;

public class Week09_RemoveAhmed {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println("Original list: " + names);

        // Remove all occurrences of "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        System.out.println("List after removing Ahmed: " + names);
    }
}

    /*
    In this code, we first create an ArrayList named names and add some names to it, including two occurrences of "Ahmed". Then, we use the removeIf method with a lambda expression to remove all elements that match the condition name -> name.equals("Ahmed").

The output of the above code will be:
Original list: [Ahmed, John, Eric, Ahmed]
List after removing Ahmed: [John, Eric]

     */




















/*
```
ArrayList - Remove "Ahmed"
Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
```
 */