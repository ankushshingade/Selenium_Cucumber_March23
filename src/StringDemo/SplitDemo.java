package StringDemo;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "Java is programming language.";

        String[] stArr = str.split(" ");

        for(int i=0; i<stArr.length; i++)
            System.out.println(stArr[i]);
    }
}
