package Loops;

public class TableOf_17 {
    public static void main(String[] args) {

        int a=17, b=1, c=a*b;
        System.out.println("Following is table of 17:");
        while(c<170){
            c=a*b;
            b++;
            System.out.println(c);
        }

    }
}

/*
public class TableOf_17 {
    public static void main(String[] args) {

        int a=17, b=1, c=a*b;
        System.out.println("Following is table of 17:");
        while(c<170){
            c=a*b;
            b++;
            System.out.println(c);
        }

    }
}
*/

