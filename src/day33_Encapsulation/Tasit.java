package day33_Encapsulation;

public class Tasit {
    private String tasitTuru="tir";
    private boolean muayenesiVarmi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }//geetter method'u da tek bir satirlik islem yapiyor
    //baska class'larin private oldugu icin tasitturu bilgisini class icinden alip istenen farkli class'lar return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayenesiVarmi() {//booelenada get yerine is? koyar java
        return muayenesiVarmi;
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}//eger bir class'da sadece setter methodlari var getter methodlari yoksa ne olu?
//cevap; bilgileri goremeyiz
