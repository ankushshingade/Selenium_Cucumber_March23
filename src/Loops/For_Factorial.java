package Loops;

public class For_Factorial {
    public static void main(String[] args) {

        int fact=1, n=7;

        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+"="+fact);
    }
}
