package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        arb1.marka="toyota";// araba class'indan arb1 objesi olusturduk ve burada markaya yeni bir deger atadik toyota
        System.out.println(arb1.marka);// markayi yazdiriyoruz
        //biz burda arb1 objesi uzerinden marka variable'ina ulasabildik,degistirebildik,ve yazdirabildik
        //yani degistirebilmek icin set
        //yazdirabilmek icinde get yapariz

        //access modifier kullanarak marka variable'ina ulasimi tamamen serbest yapabilir veya tamamen engelleyebilirim
        //private yaptigimiz araba class'in da ki model'e ise artik ulasamayiz; deneyelim?
        // ACCESS'e modofier ya hep ya hic der

        //model'i degistirelim ama goremeyelim yakitida gorelim ama degistiremeyelim
        //encaptulation 'un adimlari
        //1.adim: set ve get yetkilerini ozel olarak tanimlamak isterseniz ozel yetki tanimlayacaginiz varieble'lari private yapin
        // private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        //2.adim ; set yetkisi icin setter , get yetkisi icin getter methodlari olusturalim

        arb1.setModel("CUPRA");//model olarak Suprayi atadik
        //model'i yazdirma imkanimiz yok cunku getter yok
        System.out.println(arb1.getYakit());//elektrikli bilgisini yazdirabildik
        //yakit'i degistiremeyiz cunku setter method'u yok


    }
}
