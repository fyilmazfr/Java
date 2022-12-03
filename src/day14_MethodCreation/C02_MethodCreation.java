package day14_MethodCreation;

public class C02_MethodCreation {// verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturalim

    public static void main(String[] args) {
        int input=423; // RAKAMLARI DEGISTIREBILIRSIN
        rakamlariTopla(input);



    }public  static void rakamlariTopla(int input) {// burda return type yapmadik cunku cagirmayacagiz vebu yuzden void yazdik
        int birmerbasamagi=0;
        int rakamlarToplami=0;
        int girilensayi=input;

        birmerbasamagi=input%10;
        rakamlarToplami+=birmerbasamagi;
        input/=10;

        birmerbasamagi=input%10;
        rakamlarToplami+=birmerbasamagi;
        input/=10;

        birmerbasamagi=input%10;
        rakamlarToplami+=birmerbasamagi;
        input/=10;


        System.out.println("girilen:" +input+"sayisinin rakamlar toplami:" +rakamlarToplami);
        // sonra main method kismina doneriz ve methodumuzu cagiririz



    }

}
