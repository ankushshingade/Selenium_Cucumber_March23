package TwoD_ArrayDemo;

public class CharArrayDemo {
    public static void main(String[] args) {

        char[][] ch = new char[3][5];

        ch[0][0]='A';
        ch[0][1]='B';
        ch[0][2]='C';
        ch[0][3]='D';
        ch[0][4]='E';

        ch[1][0]='F';
        ch[1][1]='G';
        ch[1][2]='H';
        ch[1][3]='I';
        ch[1][4]='J';

        ch[2][0]='K';
        ch[2][1]='L';
        ch[2][2]='M';
        ch[2][3]='N';
        ch[2][4]='O';

        for(int i=0; i<3; i++){

            for(int j=0; j<5; j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
