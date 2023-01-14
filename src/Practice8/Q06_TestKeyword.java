package Practice8;

public class Q06_TestKeyword {//CEVAP ANAHTARI KARSILASTIRAN BIR SORU
    public static void main(String[] args) {
        char[][] answers={
                {'A','B','A','C','C','D','E','E','A','D'},//1.ogrencinin cevabi
                {'A','C','A','C','A','D','A','E','A','D'}//2.ogrencinin cevabi// ogrenci sayisi artirilabilir
        };
        char[]keys={'D','B','D','C','C','D','A','E','A','D'};

        testSonucu(answers,keys);
    }

    public static void testSonucu(char[][] answers, char[] keys) {
        for (int i = 0; i <answers.length ; i++) { //her bir ogrenciye bakar i ogrenciyi temsil eder
            int sayac=0; //herbir ogrencinin dogru cevabini sayacagi icin sayac buraya konur
            for (int j = 0; j <answers[i].length ; j++) {// j ogrencinin cevaplari
                if (answers[i][j]==keys[j]){ //cevap anahtari ile ogrenci cevaplari karsilastiriyor
                sayac++;
            }

        }
            System.out.println(i+1+"no'lu ogrencinin  dogru cevap sayisi:"+sayac);
    }

}}
