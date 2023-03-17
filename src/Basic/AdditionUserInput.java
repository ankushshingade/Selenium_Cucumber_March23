package Basic;

import java.util.Scanner;

public class AdditionUserInput {
    public static void main(String[] args) {
        int a, b, c;

        Scanner SC = new Scanner(System.in);

        System.out.println("Please enter 1st number= ");
        a=SC.nextInt();
        System.out.println("Please enter 2nd number= ");
        b=SC.nextInt();
        c=a+b;
        System.out.println("Addition = "+c);
    }
}
