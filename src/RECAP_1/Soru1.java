package RECAP_1;

import java.util.Scanner;

public class Soru1 {//mesafeyi ve hizi alip sureyi hesaplayan bir kod tanimi yaziniz
    //ornegin istanbul ankara arasi 400km dir bu yolu ort 120km/sa
    //hizla giden bir arac ne kadar surede hedefe varir
    //Hız problemlerinde hız formülü x=V.t  Bu formülde x=Yol, V=Hız ve t=Zaman
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("MESAFEYI GIRINIZ");
        double mesafe= scan.nextDouble();

        System.out.println("hizinizi giriniz");
        double hiz=scan.nextDouble();

        double zaman=(mesafe/hiz);

        System.out.println("gideceginiz yere:"+zaman +"saatte varacaksiniz");



    }
}
