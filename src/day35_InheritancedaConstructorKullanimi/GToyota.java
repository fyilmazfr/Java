package day35_InheritancedaConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("toyota parametresiz cons");
    }
    GToyota(String isim){
        //EXTENDS olmadigi isin super constructor call'u java kabul etmez
        System.out.println("toyota parametreli cons");

    }
}
