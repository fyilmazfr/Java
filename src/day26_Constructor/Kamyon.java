package day26_Constructor;

public class Kamyon {

    public String marka ="marka girilmedi";
    public String model=" model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
       this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
/*Bizim temel amacimiz Kamyon runner'da  argumen olarak girilen degerin kamyon class'inda
         instance variable'a atanmasi ancak scope konusunda ogrendigimiz gibi kamyon constructor scop'un marka oldugu icin
         instance markaya gitmiyor

         bu karisikligi gidermek icin instance variable'lari belirli hale getirmemiz lazim
         java bunun icin this keyword'u olusturmustur------->>>>>  this.

         Genel kullanim acisindan this keyword'u kodu herkesin anlamasini kolaylastirdigi icin tercih edilir

 */

    }
    public Kamyon(){

    }

    public Kamyon(String marka, String model) {//sag tiklayi generation yapip constructor olustur dedik ve ordan istedigimiz parametreleri sectik
        //iki parametre sectik
        this.marka = marka;
        this.model = model;
    }





    @Override
    public String toString() {
        return
                "marka='" + marka + '\'' +
                "\n model='" + model + '\'' +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat ;
    }
}
