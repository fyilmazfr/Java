package Practice6;

import java.util.Scanner;

public class Q02_WhileLoop {//girilen bir sayiya kadar olan sayilardan sadece tek olanlarini ekrana yazdiriniz
    //girilen sayi dahil(tek ise)

    public static void main(String[] args) {
        Scanner sacan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= sacan.nextInt();

        //
        int count=0; // her seferinde kac sayi var ona bakmak icin yaptik sart degil
        while (sayi>0){
            if (sayi%2==1){
                System.out.print(sayi+ ",");
                count++;
            }
            sayi--;// sayiya kadar dedigimiz icin azala azala gidecek

        }
        System.out.println();
        System.out.println("Girilen sayi adeti "+count);
    }
}
