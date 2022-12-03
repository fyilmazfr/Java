package day13_MethodCreation;

public class C04_3_MethodCreation { // input olarak verilen iki integer i BOLME yazdiran bir method yazdirin
    public static void main(String[] args) {
        int input1=36;
        int input2=4;

        bolme(input1,input2);
        // buraya baska method cagiralim
        C04_MethodCreation.topla(input1,input2);
        C041_1_MethodCreation.carpma(input1,input2);
        C04_2_MethodCreation.cikartma(input1,input2);


    }

    public static int bolme(int input1, int input2) {
        System.out.println("girilen iki sayinin bolumunden kalan bolumu:" +input1/input2);



       return input1/input2;
    }
}
