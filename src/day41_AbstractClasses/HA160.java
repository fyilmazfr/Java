package day41_AbstractClasses;

public class HA160 extends FMercedes{

    public static void main(String[] args) {
        HA160 arb1=new HA160();
        //concrete class'dan istedigimiz objeyi uretebiliriz.
        FMercedes arb2=new FMercedes();
        //mercedes de concrete

        //EToyota arb3=new EToyota();
        //Abstract class'lar cosructor barindirir ama obje uretemezler.
        //toyota class'i abstract class oldugundan obje uretilemez

    }



}
/*
Abstract parent silsilesinden gelen ilk concrete class parent'i olan tum class'daki abstract methodlari concrete hale
donusturmek(override etmek) ZORUNDADIR.
Bu kuralin istisnasi parent class'lardan herhangi birinde concrete hale donusturulmus , abstract method'lardir.
*/
