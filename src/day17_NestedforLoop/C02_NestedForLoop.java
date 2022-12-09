package day17_NestedforLoop;

public class C02_NestedForLoop { //soru: verilen sayiya gore carpim tablosu olusturun
    public static void main(String[] args) {
        int input=3;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= input ;j++) {
                System.out.print(i*j + " ");


            }
            System.out.println("");// satir atlamasi icin bunu yaptik

        }
    }
}
