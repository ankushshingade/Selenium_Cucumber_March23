package TwoD_ArrayDemo;

public class BooleanArrayAnotherMethod {
    public static void main(String[] args) {

        boolean[][] TT = {{false, false, false},{false, true, true},{true,false,true},{true,true,true}};

        System.out.println("Truth table for 'OR':");

        for(int i=0; i<TT.length; i++){
            for(int j=0; j<TT[0].length; j++){
                System.out.print(TT[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
