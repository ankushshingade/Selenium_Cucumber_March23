package Loops;

public class For_Fibonacci {
    public static void main(String[] args) {

        int n=10;
        int a=0, b=1, sum=0;

        System.out.print(a+" "+b);

        for (int i=n-2; i>=1; i--) {

            sum = a+b;

            System.out.print(" "+sum);

            a=b; b=sum;
        }
    }
}
