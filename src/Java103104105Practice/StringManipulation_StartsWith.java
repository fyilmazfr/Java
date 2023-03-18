package Java103104105Practice;

public class StringManipulation_StartsWith {
    /*
    metnin bas kisminin istenilen dizi ile eslenip eslesmedigini kontrol eder.sonucu boolean'dir

    endsWith; metnin son kisminin istenilen dizi ile islenip eslenmedigini kontrol eder sonuc boolean'dir

     */
    public static void main(String[] args) {
        String cumle="Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        System.out.println(cumle.startsWith("K"));
        System.out.println(cumle.endsWith("dir"));
    }
}
