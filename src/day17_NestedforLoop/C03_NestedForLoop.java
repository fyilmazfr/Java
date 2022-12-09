package day17_NestedforLoop;

public class C03_NestedForLoop {// VERILEN EN BOY DEGRINE GORE * lardan olusan bir dikdortgen olusturalim
    //yuksekliK:3 boy:4

    public static void main(String[] args) {
        int yukseklik=3;
        int boy=4;
        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                //System.out.print(i*j); bu sekilde de yapabiliriz
                System.out.print("*");


            }
            System.out.println("");
        }

    }
}
