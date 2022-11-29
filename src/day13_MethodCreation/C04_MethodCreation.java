package day13_MethodCreation;

public class C04_MethodCreation {// input olarak verilen iki integer i toplayip yazdiran bir method yazdirin
    public static void main(String[] args) {

        int input1=10;
        int input2=20;

        topla (input1,input2);



    }

    public static void topla(int input1, int input2) {
        //topla(input1,input2);
        System.out.println("girilen iki sayinin toplami: " +(input1+input2));

    }

}
