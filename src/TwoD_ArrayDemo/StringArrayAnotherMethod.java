package TwoD_ArrayDemo;

public class StringArrayAnotherMethod {
    public static void main(String[] args) {

        String[][] Test = {
                {"Name\t","Age\t","Occupation\t"},
                {"Chandler\t","35\t","Statistical analyst\t"},
                {"Monica\t","28\t","Chef\t"},
                {"Sheldon\t","34\t","Physicist\t"},
                {"Penny\t","32\t","Medical Rep\t"}
        };

        for(int i=0; i<Test.length; i++){
            for(int j=0; j<Test[1].length; j++){
                System.out.print(Test[i][j]);
            }
            System.out.println();
        }

    }
}
