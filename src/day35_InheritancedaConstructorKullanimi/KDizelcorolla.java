package day35_InheritancedaConstructorKullanimi;

public class KDizelcorolla extends HCorolla {
    KDizelcorolla(){
        System.out.println("DIZELCOROLLA parametresiz cons");
    }
    KDizelcorolla(String isim){
        super(isim);
        System.out.println("DIZELCOROLLA parametreli cons");

    }

    public static void main(String[] args) {
        KDizelcorolla obj1=new KDizelcorolla("hasan");
    }
}
