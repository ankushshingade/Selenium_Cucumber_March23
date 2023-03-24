package ArrayDemo;

public class StringArray {
    public static void main(String[] args) {

        String[] firstname = new String[5];

        firstname[0]= "Sachin";
        firstname[1]= "Rahul";
        firstname[2]= "Mahendra";
        firstname[3]= "Virat";
        firstname[4]= "Yuvraj";

        System.out.println("First names:");

        for (int i=0; i<5; i++){
            System.out.println(firstname[i]);
        }

        String[] lastname= {"Tendulkar","Dravid","Singh Dhoni","Kohli","Singh"};

        System.out.println("====================");
        System.out.println("====================");
        System.out.println("Last names:");

        for(String j : lastname){
            System.out.println(j);
        }
    }
}
