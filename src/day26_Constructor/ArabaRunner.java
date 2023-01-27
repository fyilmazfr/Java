package day26_Constructor;

import day25_Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        //bir onceki gunden Car class'indan obje olusturalim
        Car car1=new Car();//burda car class'ini getirdik ve java bize hemen yukarda goruldugu gibi import yapti
        //yani 25.package dan bize import yapti,ordaki Car class'ini bize getirdi
        System.out.println(car1.fiyat);
        // farkli bir package 'daki bir class'dan obje olusturdugumuzda acces modifier'leride dikkate almamiz lazim

        Araba araba1=new Araba();
        araba1.fiyat=100000;
        araba1.marka="mercedes";
        araba1.yil=2010;
        araba1.model="c180";
        System.out.println("marka:"+araba1.marka+ "\n"+"model;"+ araba1.model+"\n"+"yil:"+araba1.yil+ "\n"+"fiyat;"+araba1.fiyat);
        System.out.println();//araya bosluk attim
// EGER BIR OBJEYI OLUSTURURKEN bazi ozellikleri argument olarak belirtip o ozelliklerde bir obje
        //olusturmak istersek java itiraz eder.
        // cunku her class'da default constructor vardir ama o da parametresizdir
        //bizim yeni ve parametreli constructorlara ihtiyacimiz var

        Araba araba2=new Araba("BMW","5.20",2011,150000);//burda ayni method
        //olusturur gibi uzerine tiklayarak Araba class'inda java bize constructor olusturdu
        //stringlerin yanindaki marka ,model , fiyat ,ve yil i biz tekrardan isimlendirdik
        System.out.println("marka:"+araba2.marka+ "\n"+"model;"+ araba2.model+"\n"+"yil:"+araba2.yil+ "\n"+"fiyat;"+araba2.fiyat);

        System.out.println();// BOSLUK YAPALIM


        Araba araba3=new Araba("OPEL","ASTRA",2015,78000);//burda ayni method
        System.out.println("marka:"+araba3.marka+ "\n"+"model;"+ araba3.model+"\n"+"yil:"+araba3.yil+ "\n"+"fiyat;"+araba3.fiyat);

        System.out.println();
        Araba araba4 =new Araba("Audi","A5",2020,50000);
        System.out.println("marka:"+ araba4.marka+ "\n"+"model;"+ araba4.model+"\n"+"yil:"+ araba4.yil+ "\n"+"fiyat;"+ araba4.fiyat);


    }
}
