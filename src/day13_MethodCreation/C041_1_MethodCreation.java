package day13_MethodCreation;

public class C041_1_MethodCreation {// input olarak verilen iki integer i CARPMA yazdiran bir method yazdirin

    public static void main(String[] args) {
        int input1=10;
        int input2=20;

        carpma (input1,input2);

        // ornegin;bir onceki class dan method cagiralim
        C04_MethodCreation.topla(10,20);




    }

    public static int carpma(int input1, int input2) {
        System.out.println("girilen iki sayinin carpimi: " +(input1*input2));

        return input1+input2;

    }


    }



