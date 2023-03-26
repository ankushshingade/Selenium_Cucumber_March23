package TwoD_ArrayDemo;

public class IntArrayAnotherMethod {
    public static void main(String[] args) {

        int[][] a = {
                {12,23,34},
                {52,64,37},
                {43,65,88},
                {76,45,21},
                {98,19,976}

        };

        for(int i=0; i<a.length; i++){

            for(int j=0; j<a[1].length; j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


//        for(int[] i:a){
//            for(int j: a){
//
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
