package IfElse;

import java.util.Scanner;

public class TriangleTypes_Sides {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Please enter sides of given triangle: ");
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();

        if((a==b) && (b==c))
            System.out.println("Given triangle is Equilateral.");

        if((a!=b) && (b!=c) && (c!=a))
            System.out.println("Given triangle is Scalene.");

        if ((a==b && b!=c)||(b==c && c!=a)||(a==c && a!=b))
            System.out.println("Given triangle is Isoscelece.");
    }
}
