package Practice5;

import java.util.Scanner;

public class Q04_MetCreationFoorLoop {/* write a java program to reserve a string.
                                use forLoop and create a method called reverseString*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str= scan.nextLine();
        System.out.println("Strin'in tersi :"+reverseString(str));//bu kismi yazdirmasi icin en son ekliyoruz

        reverseString(str);
    }

   public static String reverseString(String str) {
        String reversed="";//Hiclik atadik cunku kullanicinin ne yazilacagini bilmiyoruz
       for (int i = str.length()-1; i >=0 ; i--) {//

           reversed+=str.charAt(i);//son karakteri reversed'e ekle dedik

       }



       return reversed;//geri donus yaptirdik
   }

}
