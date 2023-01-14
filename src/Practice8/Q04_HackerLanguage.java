package Practice8;

import java.util.Scanner;

public class Q04_HackerLanguage {/*hackerlar bazi harfleri sayilara cevirerek yazisabiliyorlar*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cule giriniz");
        String cumle= scan.nextLine().toLowerCase();
        hackerDILI(cumle);
    }

    public static void hackerDILI(String cumle) {
        String arr[] = new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i, i + 1);
            //System.out.print(arr[i]);

            if (arr[i].contains("s")) {
                arr[i] = "5";

            }
            if (arr[i].contains("a")) {
                arr[i] = "4";


            }
            if (arr[i].contains("e")) {
                arr[i] = "3";//burayi uzatabiliriz ....

            }
            System.out.print(arr[i]);

        }
    }}