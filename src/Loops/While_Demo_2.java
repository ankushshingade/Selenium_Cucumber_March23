package Loops;

import java.util.Scanner;

public class While_Demo_2 {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer:");

        a=sc.nextInt();

        while(a!=10){

            System.out.println("Inside WHILE loop.");
            a=sc.nextInt();
        }
    }
}
