package day04;

public class C01_DataCasting {//java da kod yazarken bir veri tipinden baska bir veri tipine aktarim yapmamizgerekebilir
    // javanin musade ettigi kadar.CUNKU HER DATA TURU BIRBIRINE CAST YAPILMAZ
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char) (harf+1);// KOD BU DURUMDA ONCE SAGDAKI ISLEMI YAPAR
        System.out.println(yeniHarf);// parantez icine (char) yazarak 97+1=98  in degeri aski tablosunda b ve java
        //BUNU BIZE OTOMATIK OLARAK GETIRIR
    }
}
