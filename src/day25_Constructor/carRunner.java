package day25_Constructor;

public class carRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="toyata";
        System.out.println("marka:"+car1.marka+ "\n"+ car1.model+"\n"+car1.yil+ "\n"+car1.fiyat);//sout guzellestirilebilir ben yapmadim


        Car car2=new Car();
        System.out.println("marka:"+car2.marka+ "\n"+ car2.model+"\n"+car2.yil+ "\n"+car2.fiyat);

        /* herhangi bir obje uzerindenr variable yazdirmaya calistigimizda
        java degeri su siralama ile arar
        1; o obje olusturulduktan sonra bir deger atandimi?
        2; objenin olusturuldugu class'da variable 'a bir deger atanmismi bir bakar
        3; O ZAMAN DATA turune gore java default degeri atar

         */


    }
}
