package TwoD_ArrayDemo;

public class String2DArray {
    public static void main(String[] args) {
        String[][] allNames = new String[4][3];

        allNames[0][0] = "Akshay    ";
        allNames[0][1] = "Amrut     ";
        allNames[0][2] = "Ankush    ";

        allNames[1][0] = "Arundhati ";
        allNames[1][1] = "Avinash R.";
        allNames[1][2] = "Jagrit    ";

        allNames[2][0] = "Jayanta   ";
        allNames[2][1] = "Anusha    ";
        allNames[2][2] = "Latha     ";

        allNames[3][0] = "Avinash V.";
        allNames[3][1] = "Narayanan ";
        allNames[3][2] = "Purnisha  ";

        for(int i=0; i<allNames.length; i++){
            for(int j=0; j<allNames[0].length; j++){
                System.out.print(allNames[i][j]+" ");
            }
            System.out.println();
        }

        String[] S1 = {"a0", "a1", "a2"};
        String[] S2 = {"b0", "b1", "b2"};
        String[] S3 = {"c0", "c1", "c2"};
        String[] S4 = {"d0", "d1", "d2"};

        String[][] TwoDStArr = {S1,S2, S3, S4};

        for(int i=0; i<TwoDStArr.length; i++){
            for(int j=0; j<TwoDStArr[0].length; j++){
                System.out.print(TwoDStArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
