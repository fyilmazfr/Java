package Java103104105Practice;

public class AsciiDegerleri {
    /*
    harf ve sembollerin (kucuk buyuk dahil)  bir karsiligi var,
     */
    public static void main(String[] args) {
        char harf='a';
        char Harf2='A';
        System.out.println("harf harf2den buyukmudur? ;"+ (harf>Harf2));


        char space=' ';
        System.out.println("space'in ascii degeri ="+(space+0));
//aski degerini hesaplarken degeri 0 ile toplamak yani etkisiz
        //elemanla toplamak yeterlidir

        //2. yol; char karakteri int'a atayarak yapariz

        int m='m';
        System.out.println("ascii degeri ;"+m);//;109

        /*soru; byte b1=12;
        byte b2=125;
        */
        byte b1=12;
        byte b2=-125;
        System.out.println("b1 b2 den buyukmudur ;"+(b1>b2));//true

        float f1=2.34567f;
        float f2=4.78655f;
        System.out.println("f1 f2 den buyukmudur ;"+(f1>f2));//false
    }

}

