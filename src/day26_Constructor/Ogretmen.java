package day26_Constructor;

public class Ogretmen {
    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String dogumtarihi="tarih girilmedi";
    String brans="brans belirtilmedi";
    String yanBrans="yan brans belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumtarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    //VEYA ISTEGE BAGLI BELLI PARAMETRELER OLMASIN DIYORSAK


    public Ogretmen(String isim, String soyisim, String dogumtarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
    }
    //bir tanede toString methodu koyalim ogretmenin tum ozelliklerini yazdirmak icin

    @Override
    public String toString() {
        return
                "\nisim=" + isim +  //bu kismi guzellestirmek bize kalmis...
                "\n soyisim=" + soyisim +
                "\n dogumtarihi=" + dogumtarihi +
                "\n brans=" + brans +
                "\n yanBrans=" + yanBrans
                ;
    }
}
