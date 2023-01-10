package Practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {/*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
 *  1. Kullanicidan ismini isteyelim
 *  2. Kullanici adindaki bosluklari silelim.
 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
 *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */

    public static void main(String[] args) {
        List<String> databaseIsimler=new ArrayList<>();
        databaseIsimler.add("enes");
        databaseIsimler.add("ismail");
        databaseIsimler.add("abdulbaki");
        databaseIsimler.add("emre");
        databaseIsimler.add("melisa");
        databaseIsimler.add("oguz");
        System.out.println("databaseIsimler"+ databaseIsimler);
        System.out.println(databaseIsimler);

        Scanner sc=new Scanner(System.in);
        System.out.println("kullanmak istediginiz ismi giriniz");
        String userName=sc.nextLine().trim();

        boolean userNameVarMi=databaseIsimler.contains(userName);

        if(userNameVarMi) {
            System.out.println("bu kullanici adi alinmis");

        }else{
            System.out.println("bu kullanici adini kullanabilirsiniz");

        }if(userNameVarMi){
            int randomSayi= new Random().nextInt(100);
            userName=userName+""+randomSayi;
            System.out.println("yeni kullanici adiniz : " +userName);
            databaseIsimler.add(userName);//yeni ismi ekledik
            System.out.println(databaseIsimler);
        }else{
            System.out.println("yeni kullanici adiniz :"+userName );
        }
    }
}



