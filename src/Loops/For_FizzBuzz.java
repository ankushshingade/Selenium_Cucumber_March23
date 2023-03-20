package Loops;

public class For_FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if ((i%3 == 0) && (i%5 == 0))
                System.out.println(i + "\t FizzBuzz");
            else if(i%3 == 0)
                System.out.println(i + "\t Fizz");
            else if(i%5 == 0)
                System.out.println(i + "\t Buzz");
            else
                System.out.println(i);

        }
    }
}
