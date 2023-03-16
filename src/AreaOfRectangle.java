import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        double Length, Width, Area;

        Scanner SC = new Scanner(System.in);

        System.out.println("Please enter Length and Width of rectangle: ");
        Length=SC.nextDouble();
        Width=SC.nextDouble();

        Area=Length * Width;

        System.out.println("Area of rectangle = "+Area);

    }
}
