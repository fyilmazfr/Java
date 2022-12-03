package day13_MethodCreation;

public class C04_2_MethodCreation { // input olarak verilen iki integer i CIKARTMA yazdiran bir method yazdirin
    public static void main(String[] args) {

        int input1=40;
        int input2=20;

        cikartma(input1,input2);
        // ornegin diger classdan carpma ve toplama methodlarini cagiralim
        C041_1_MethodCreation.carpma(input1,input2);
        C04_MethodCreation.topla(input1,input2);


    }

    public static int cikartma(int input1, int input2) {
        System.out.println("girilen iki sayinin farki:"+ (input1-input2));

        return input1-input2;
    }
}
