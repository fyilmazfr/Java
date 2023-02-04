package day30_immutable_Date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2);// FALSE
        System.out.println(str1.equals(str2));//true eguals methodunda supriz olmaz icerige bakar

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false  , bu ikisine dikkat et bir ustte true verirken burda false verdi neden?
        //cunku str3 de yeni bir string tanimladik bunun da referansa numarasini java ayri atadi ve == metodu da referanslara bakar

        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false

        System.out.println("s1-s4"+str1.equals(str4));// true
        System.out.println("s1-s4"+ (str1==str4));//true

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5));//true
        System.out.println(str5==str1);// true  ????? FARKLI IKI OBJE OLMASINA RAGMEN == dogru alisti yani true verdi

        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true verdi

        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true

        /*yeni bir string olustururken esitligin saginda new keyword'u olursa java direk yeni bir obje ve referansi olusturur
        * eger esitligin saginsda bir method calisiyor veya HERHANGI BIR ISLEM YAPILIYORSA STRING
        IMMUTABLE  oldugundan degisikligi kaydetmek uzere hemen bir kopya String ve ref olusturup sonra degeri hesaplanip
        bu yeni kopya objenin icine koyar

        * eger  yeni string objesi olustururken new kelimesi kullanilmaz veya esitligin saginda bir islemolmazsa java bakar
        * eger daha once olusturulan string objelerden (string havuzu) bire bir ayni string varsa
        o objeyi ve referansini kullanir
        * bire bir aynisi yoksa yeni bir obje olusturur


         */
    }
}
