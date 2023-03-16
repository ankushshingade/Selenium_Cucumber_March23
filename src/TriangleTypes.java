import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {

        // Types of triangles based on angle.
        // Acute angled triangle: All three angles are < 90 degree
        // Obtuse angled triangle: 1 out of 3 angle is > 90 degree
        // Right angled triangle: 1 out of 3 angle is = 90 degree

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Please enter angles of given triangle: ");
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();

        // Check if given angles can form a triangle.
        if ((a+b+c) == 180){
            System.out.println("Given angles can form a triangle.");

            if ((a<90) && (b<90) && (c<90))
                System.out.println("Given triangle is an ACUTE angled triangle.");
            if ((a>90) || (b>90) || (c>90))
                System.out.println("Given triangle is an OBTUSE angled triangle.");
            if ((a==90) || (b==90) || (c==90))
                System.out.println("Given triangle is a RIGHT angled triangle.");
        }
        else
            System.out.println("Given angles cannot form a triangle.");
    }
}
