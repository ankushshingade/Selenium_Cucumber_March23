package ArrayDemo;

public class CharArray {
    public static void main(String[] args) {

        char[] chArray = new char[10];

        chArray[0]='A';
        chArray[1]='B';
        chArray[2]='C';
        chArray[3]='D';
        chArray[4]='E';
        chArray[5]='F';
        chArray[6]='G';
        chArray[7]='H';
        chArray[8]='I';
        chArray[9]='J';

        for(int i=0; i<10; i++){
            System.out.print(chArray[i]+"\t");
        }

        char[] chArray2 = {'Q','W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};

        //chArray2 = {Q,W,E,R,T,Y,U,I,O,P};

        for(char a: chArray2){
            System.out.print(a);
        }

    }
}
