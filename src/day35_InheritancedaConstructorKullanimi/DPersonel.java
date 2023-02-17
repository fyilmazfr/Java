package day35_InheritancedaConstructorKullanimi;

public class DPersonel {
    DPersonel(){
        //iste burda bu satirda super();{} const yoktur cunku extends yoktur.
        //artik burdan bir alt satira gecer ve yazdirir yani 7. satiri yazdirir
        System.out.println("personel parametresiz constructor");
        //7 SATIRI YAzdirdiktan sonra muhasebeden 13. satir
        //ve ardindan da geriye dogru gider memur class'indan 8. satiri yazdirir consola

    }
    DPersonel(String isim){
        System.out.println("personel parametreli constructor");
    }
}
