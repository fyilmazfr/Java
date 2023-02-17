package day35_InheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{
    HCorolla(){

        System.out.println("corolla parametresiz cons");
    }
    HCorolla(String isim){
        super(isim);//bu sefer kendimiz bir super const call yazdik
        System.out.println("corolla parametreli cons");

    }
}
