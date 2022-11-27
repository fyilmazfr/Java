package day04;

public class C02_DataCasting {
    public static void main(String[] args) {
        int Sayi1=23;
        int Sayi2=5;
        System.out.println(Sayi1/Sayi2);//sonuc mat de ondalikli sayi cikar,fakat java sonucu int olarak kabul eder yani
        //virgulden sonrasini atar ve yazdirir
        double Sayi3=5;
        System.out.println((Sayi1/Sayi3));//bu sefer double ile yaptik ve java iki veriable in data turu degisik oldugun
        // dan daha kapsamli olani secer sonucu veri kaybi olmadan yazdirir
    }
}
