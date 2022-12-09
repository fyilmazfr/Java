package day15_Overloading_forLoop;

public class C08_Factoriyel {// input olarak verilen bir tam sayi icin faktoryel hesaplayip yazdiran bir method olusturun
    // verilen sayi negatif,0,veya 20 den buyuk olursa ""girilen sayinin faktoryeli hesaplanmaz" uyarisi yazdirin

    public static void main(String[] args) {
        int input=5;

        faktoriyel(input);
    }

    public static void faktoriyel(int input) {
        int faktorielKasa=1; // faktoryel bir carpma islemidir, buyuzden bos kasayi 1 e esitledik , 0 verseydik sonuc
        //herzaman 0 olacakti

        if (input<0 || input>20){
            System.out.println("girilen sayinin faktoryeli hesaplanmaz");
        }else if (input==0){
            System.out.println("0! 1 dir");
        } else  {
            for (int i = 1; i <=input ; i++) {
                  faktorielKasa *=i;// her i degerini faktoriyel kasasina carparak at

            }
            System.out.println("faktoriyelin degeri:" +faktorielKasa);
        }
    }

}
