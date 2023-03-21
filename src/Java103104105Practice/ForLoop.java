package Java103104105Practice;

public class ForLoop {
    /*
    kullanicidan baslangic bitis ve artis miktarini alarak
    aradaki tum sayilari aralarina virgul koyarak yazdirin
     */
    public static void main(String[] args) {
        int input =10;
        int bitis=50;
        int artisMiktari=5;

        for (int i = input; i <=bitis ; i+=artisMiktari) {

            //sondaki virgulu yok etmek icin yapabiliriz
            if (i<bitis){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }

    }

}

