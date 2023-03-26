package Java103104105Practice;

import java.util.Arrays;

public class Arrays2 {
    /*
    kullanicinin yazdigi metni hackerlarin konusma diline ceviren kodu yaziniz
    hackerlar bazi harfleri sayilara cevirerek yazisabiliyorlar
    s=5
    a=4
    e=3
    i=1
    o=0
    java ile hersey guzel yazcagiz
     */
    public static void main(String[] args) {
      char s = '5';
        String a = "4";
        String e = "3";
        String I = "1";
        String o = "0";
        String str = "java ile hersey guzel yazcagiz";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("s") ) {
                arr[i] = "5";
            }

            if (arr[i].contains("a")) {
                arr[i] = "4";
            }
            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);


        }

    }

}

