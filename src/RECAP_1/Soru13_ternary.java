package RECAP_1;

public class Soru13_ternary {/*ternary kullanarak bir kod yaziniz
        fiyat isminde bir variable tanimlayin
        eger fiyat < 10ise ucuz
        10 ile 20 arasinda ise normal
        20 ve 20 den buyukse pahali olsun
         */
    // Scanner scan=new Scanner(System.in);
    // System.out.println("lutfen fiyat giriniz");
    public static void main(String[] args) {

        int fiyat=50; // atadigimiz degeri degistirebiliriz
        String sonuc= (fiyat<10) ?("ucuz"):(fiyat>=10 && fiyat<20)?("normal"): ("pahali");
        // once tanimlama yapariz sonra sonucu yazdiririz
        System.out.println(sonuc);



    }

}
