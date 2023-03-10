package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_05 {
    /*
    kullanicidan yasini isteyiniz
    65 Veya daha buyukse emekli olabilirsin
    65'den kucukse emekli olamazsin ? sene daha calismalisin
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        int emeklilikYasi=67;

        if (yas>=65){
            System.out.println("emekli olabilirsiniz");
        }else if (yas<=64 && yas>=16){
            System.out.println("emekli olamazsiniz"+((emeklilikYasi-yas))+" yil daha calismalisiniz");
        }else if (yas<=15 || yas==0){

            System.out.println("lutfen gecerli yas giriniz-");
        }
    }
}
