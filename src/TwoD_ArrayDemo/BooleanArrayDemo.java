package TwoD_ArrayDemo;

public class BooleanArrayDemo {
    public static void main(String[] args) {

        boolean[][] TT = new boolean[4][3];

        System.out.println("Truth table for 'AND':");

        TT[0][0]= false;
        TT[0][1]= false;
        TT[0][2]= false;

        TT[1][0]= false;
        TT[1][1]= true;
        TT[1][2]= false;

        TT[2][0]= true;
        TT[2][1]= false;
        TT[2][2]= false;

        TT[3][0]= true;
        TT[3][1]= true;
        TT[3][2]= true;

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(TT[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
