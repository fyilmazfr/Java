package Practice6;

import java.util.Arrays;

public class Q06_Arrays {/* String'iniz "heySiri" diziyi "byeSiri"ye cevirin */

    public static void main(String[] args) {
      String str="heySiri";
      str=str.replace("hey","bye");

      String [] strlar=new String[1];//dizi olusturduk
      strlar [0]=str;//olusturulan str'i 0'inci indexe atadik
        System.out.println(Arrays.toString(strlar));
    }
}
