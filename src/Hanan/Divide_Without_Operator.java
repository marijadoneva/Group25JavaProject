package Hanan;

import java.util.Scanner;

public class Divide_Without_Operator {

    public static void main(String[] args) {

        int num1,num2,div, result=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value to num1: ");

        num1=input.nextInt();

        System.out.print("Enter the value to num2: ");

        num2=input.nextInt();

        div=num1+num2;
        while(div>num2){
            div= div-num2;
            result++;

        }
        System.out.println("Division of " + num1+ " and " +num2+" : " +result);
    }
}

