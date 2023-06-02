package TwoD_ArrayDemo;

public class String2DArray2 {
    public static void main(String[] args) {
        String[][] allNames1 = {
                {"Seema","Vanita","Sandhya"},
                {"Rupin","Rama","Purnasha"},
                {"Nisha","Narayanan","Latha"},
                {"Kalandhar","Anusha","Jayanta"}
        };

        for(int i=0; i<allNames1.length; i++){
            for(int j=0; j<allNames1[0].length; j++){
                System.out.print(allNames1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
