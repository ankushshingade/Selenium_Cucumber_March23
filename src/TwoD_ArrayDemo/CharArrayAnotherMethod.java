package TwoD_ArrayDemo;

public class CharArrayAnotherMethod {
    public static void main(String[] args) {

        char[][] ch = {
                {'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'}
        };

        for(int i=0; i<ch.length; i++){

            for(int j=0; j<ch[2].length; j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
