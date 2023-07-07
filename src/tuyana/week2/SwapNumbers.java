package tuyana.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println("Before Swapping ");
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Before Swapping");
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);





    }
}

/*
Numbers -- Swap Numbers
 Swap two variable values without using a third variable
 */