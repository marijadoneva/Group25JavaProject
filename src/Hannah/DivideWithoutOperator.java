package Hannah;

public class DivideWithoutOperator {

    public static int divide(int dividend, int divisor){
        int quotient = 0;
        int remainder = dividend;
        while(remainder >= divisor)
        {
            remainder = remainder - divisor;
            quotient = quotient + 1;
            //System.out.println("Rem ="+remainder+ " quotient ="+quotient);
        }
        return quotient;
    }
    public static void main(String[] args) {
        System.out.println("20/3 = "+ divide(20,3));
    }
}
