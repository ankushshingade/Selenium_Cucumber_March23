package IfElse;

import java.util.Scanner;

public class SwitchCase_Demo {
    public static void main(String[] args) {

        int a=80, b=20, c;

        Scanner sc = new Scanner(System.in);

        String Operation = "div"; // "mul" "add" "sub"

        System.out.println("Please enter two numbers");
        a= sc.nextInt();
        b= sc.nextInt();

        System.out.println("Please enter operator (add, sub, mul, div): ");
        Operation= sc.next();


        switch (Operation){

            case "add":
                c=a+b;
                System.out.println("Addition= "+c);
                break;

            case "sub":
                c=a-b;
                System.out.println("Subtraction= "+c);
                break;

            case "mul":
                c=a*b;
                System.out.println("Multiplication= "+c);
                break;

            case "div":
                c=a/b;
                System.out.println("Division= "+c);
                break;

            default:
                System.out.println("Incorrect operator");
                break;
        }

    }
}
