package TwoD_ArrayDemo;

public class StringArrayDemo {
    public static void main(String[] args) {

        String[][] Test = new String[5][3];

        Test[0][0] = "Name\t";
        Test[0][1] = "Age\t";
        Test[0][2] = "Occupation\t";

        Test[1][0] = "Ross\t";
        Test[1][1] = "35\t";
        Test[1][2] = "Paleontologist\t";

        Test[2][0] = "Phoebe\t";
        Test[2][1] = "33\t";
        Test[2][2] = "Musician\t";

        Test[3][0] = "Rachel\t";
        Test[3][1] = "28\t";
        Test[3][2] = "Fashion Executive\t";

        Test[4][0] = "Joey\t";
        Test[4][1] = "32\t";
        Test[4][2] = "Actor\t";

        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.print(Test[i][j]);
            }
            System.out.println();
        }

    }
}
