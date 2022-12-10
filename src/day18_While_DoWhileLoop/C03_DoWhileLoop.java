package day18_While_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=7; //sayi 10 dan kuck olana kadar calistir
        while (sayi<10){
            sayi++;
            System.out.println("sayi = " + sayi);
        }



        sayi=7;

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);

        }
    }


