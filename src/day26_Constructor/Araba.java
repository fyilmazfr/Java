package day26_Constructor;

public class Araba {

    public String marka = "marka girilmedi";
    public String model = " model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String MARKAr, String modelR, int YILr, int FIYATr) {
        marka=MARKAr;
        model=modelR;
        yil=YILr;
        fiyat=FIYATr;
        //yeni bir atama yaptik


    }
    public Araba(){

    }
    /* biz herhangi bir constructor olusturdugumuzda java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak  mutlaka default constructor
    yerine parametresiz bir constructor olusturmaliyiz
     */








    public void benzinliArac() {
        System.out.println("bu arac benzinli motora sahiptir");

    }

    public void maxHiz(int hiz) {
        System.out.println("bu arab max" + hiz + " km hiz yapar");
    }
}
