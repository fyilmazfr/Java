package day33_Encapsulation;

public class ogretmen {
    private String isim;
   private String soyIsim;
    private String brans;

    /*Bazen'de yetkileri sinirlamak degilde yapilan isi daha iyi tanimlamak icin encaptulation kullanilir
    Bu yaklasimi kullanan class'larda tum variable'lar private yapilip hepsi isin getter ve setter olusturulur
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
