package EKSTRA_SORULAR;

public class C18_ForLoop {// 100 den baslayarak 50 ye kadar olan sayilari aralarinda virgul olarak yazdirin
    // eger sayi cift ise sayi yerine melih-senih-bahtinur yazdirin
    public static void main(String[] args) {
        for (int i = 100; i >=50 ; i--) {
            if (i%2==0){
                System.out.print("melih_senih_bahtinur"+",");
                System.out.println("");

            }else {
                System.out.println(i+",");
            }
            }

        }
    }

