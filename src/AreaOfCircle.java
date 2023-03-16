import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double r=4;
        double area;
        double pi=3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Circle= ");
        r=sc.nextDouble();

        area=pi*r*r;

        System.out.println("Area of the circle= "+ area);
    }
}
