package day35_InheritancedaConstructorKullanimi;

public class Logretmen {
    Logretmen(){
        System.out.println("ogretmen parametresiz cons");
    }
    Logretmen(String isim){
        this();
        System.out.println("ogretmen parametreli cons");
    }
}
