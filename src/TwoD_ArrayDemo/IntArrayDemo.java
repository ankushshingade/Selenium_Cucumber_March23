package TwoD_ArrayDemo;

public class IntArrayDemo {
    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0]=12;
        a[0][1]=23;
        a[0][2]=324;

        a[1][0]=52;
        a[1][1]=63;
        a[1][2]=36;

        a[2][0]=44;
        a[2][1]=25;
        a[2][2]=32;

        a[3][0]=76;
        a[3][1]=87;
        a[3][2]=350;

        a[4][0]=78;
        a[4][1]=12;
        a[4][2]=80;


        for(int i=0; i<5; i++){

            for(int j=0; j<3; j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


//        for(int[] i:a){
//            for(int[] j: a){
//
//                System.out.print(a[j]+" ");
//            }
//        }
    }
}
