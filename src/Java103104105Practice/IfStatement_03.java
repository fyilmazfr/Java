package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not= scan.nextInt();

        if (not>=90){
            System.out.println("A , COK IYI");
        }else if (not<89 && not>=80){
            System.out.println("B ,IYI");
        }else if (not<=79 && not>=70){
            System.out.println("C , ORTA");
        }else if (not<=69 && not >=60){
            System.out.println("D , GECER");
        }else {
            System.out.println("F , ZAYIF");
        }

    }
}
