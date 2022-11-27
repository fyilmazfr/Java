package Practice1;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        int yas=34;
        double boy=1.70;
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);

        // DEGERLERI KOPYALAMA
        int yasim=34;
        int enesinYasi=yas;
        System.out.println("enesinYasi = " + enesinYasi);
        System.out.println("yasim = " + yasim);

        // coklu deger atayabilirim,ayni satirda tekrar tekrar int yazmama gerek yok
        int yil=2020,  ay=11 ,  gun=19;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        // Uptating a value yani atadigin degeri degistirme orn,yili degistirelim
         yil=2032;
        System.out.println("UPTADE yil = " + yil);

        // BIR DEGISKEN TANIMLAYIN

        //BIR DEGISKEN TANIMLAYIN
        //BASKA BIR DEGISKENI INITIALIZE EDIN ? YANI YENIDEN TANIMLAYIN YAILANDRIRIN
        // X degiskenini initialize edin
        //Y DEGISKENINI YENI BIR DEGERLE GUNCELLEYIN
        int x;
        int y=2000;
        x=24;// INITIALIZE ETTIK
        y=3000;// BU DEGERIDE GUNCELLEDIK
        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}
