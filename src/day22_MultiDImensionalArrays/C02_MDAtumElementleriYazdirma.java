package day22_MultiDImensionalArrays;

public class C02_MDAtumElementleriYazdirma {/*verilen bir multi dimensional arrray'in tum elementlerini yazdiran
    bir method olusturun*/

    public static void main(String[] args) {
        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}}; // iki katli bir array olusturalim,hepsinin uzunluklari farkli

        elementleriyazdir(sayilar);//bir method olusturduk
    }

    public static void elementleriyazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {//i=0,1,2 (index) degerlerini alacak
            for (int j = 0; j < sayilar[i].length; j++) {//inner arraylerin uzunluguna kadar calisacak
                System.out.print(sayilar[i][j]+" ");//1 5 6 9 2 5 3 1 6 yazdirir

            }

        }
    }
}
