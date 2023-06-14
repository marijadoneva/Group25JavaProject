import java.util.Scanner;

public class NumberDivider {
    public static void main(String[] args) {
        int a,b,c, result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        b= sc.nextInt();
        c=a+b;
        while(c>b)
        {
            c=c-b;
            result++;

        }
        System.out.println("The result is: "+result);

    }


}

/*
 2 - Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */
