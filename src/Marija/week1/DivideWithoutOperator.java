package Marija.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        divide(8,4);
        divide(10,2);


    }

    public static void divide(int num1,int num2){

        int result=0;
       while (num1>=num2){
           num1=num1-num2;
           result++;
       }
        System.out.println(result);
    }
}
/*
 2 - Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */