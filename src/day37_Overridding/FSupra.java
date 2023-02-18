package day37_Overridding;

public class FSupra extends EToyota{
    @Override
    void yakit(){//yakit yazinca overridding isareti cikti cunku Daraba class'inda yakit methodu vardi
        System.out.println("supra benzin kullanir");
    }

    @Override
    void motor() {
        System.out.println("sirali 6 silindir 2JZ motor kullanir");
        /*
         @Override notasyonu Javaya bir gorev verir ,Java bu notasyonla birbirine bagli olan iki method'u surekli kontrol eder
         surekli kontrol eder
         Eger parent class'daki overridden method'u silerseniz java CTE verir
         */
    }
}
