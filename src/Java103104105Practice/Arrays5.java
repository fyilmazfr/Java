package Java103104105Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays5 {
    /*
    interwiew sorusu
    Kullanicidan alinan bir tamsayiya kadar FIBONACCI dizisi olusturun

     */
    public static void main(String[] args) {
        List<Integer> fibonacchi=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        fibonacchi.add(0);
        fibonacchi.add(1);

        int i=1;
        if (sayi<=1){
            System.out.println("lutfen 1 den buyuk bir sayi giriniz");
        }else{
            while (fibonacchi.get(i)<sayi){
                fibonacchi.add(fibonacchi.get(i)+ fibonacchi.get(i-1));//bir onceki ile bir sonrakini toplaya toplaya git
                i++;//bir basamak ilerlesin
            }
            if (fibonacchi.get(fibonacchi.size()-1)>sayi){//fibonacchide yer almiyorsa
                fibonacchi.remove(fibonacchi.size()-1);//son elemani sil
                System.out.println("girdiginiz sayi fibonacchide yer almiyor.girilen sayiya kadarki fibonacchi"+fibonacchi);
            }else{
                System.out.println("girdiginiz sayi bir fibonacchi sayisidir"+fibonacchi);
            }
        }
    }

}
