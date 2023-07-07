package tuyana.week3;

public class PrimeNumber {

    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        if(isPrime(11))
            System.out.println(" true");
        else System.out.println("false");
        if(isPrime(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }



}

/*
**Numbers -- PrimeNumber**
Write a method that can check if a number is prime or not


 */
