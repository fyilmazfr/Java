package day35_InheritancedaConstructorKullanimi;

public class Matematikciler extends Logretmen{
    Matematikciler(){
        System.out.println("matematikciler parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("matematikciler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("tugba");
    }
    /*
    this() constructor call, icinde bulunulan class'daki constructorlari
    super cons call ise parent class'da bulunan constructorlari cagirir

    this() veya super() parametre yapisina uygun bir constructor bulamzsa? Java CTE verir.
    con konusunda gormedigimiz this. o class'daki instance variable'lari refere ediyordu
    Inheritence da da super. vardir ve parent class'daki instance'lari refere eder.
     */
}
