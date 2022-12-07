package day15_Overloading_forLoop;

public class C05_ForLoop {// 1 den 5e kadar olan tamsayilari toplayalim

    public static void main(String[] args) {
        int toplam = 0; // once 0 i toplama atadik cunku suan kasamizda hicbir sayi yok
        for (int i = 1; i <= 5; i++) {

            toplam +=i; // her i dongusunde toplamlari buraya atacak java
        }
        System.out.println("toplam :" + "" + toplam); // sout dongusu for dongusunun disina koymamiz gerekir,
        //aksi halde surekli calisir


    }
}
