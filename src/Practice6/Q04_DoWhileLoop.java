package Practice6;

import java.util.Scanner;

public class Q04_DoWhileLoop {/*ask user to enter a word if the word has odd number of characters
    and has 3 or more charecters
    print the charecter in the middle of the word if you entered wrong word
    the word has even number of character print " you are wrong word"
    input : celik
    output : l
     input : elif
     output : you entered wrong word */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="";


        do {
            System.out.println("lutfen bir str giriniz");
            str=scan.nextLine();
            if (str.length()<3){
                System.out.println("girilen kelime 3 karakterden az");
            }if (str.length()%2==1 && str.length()>=3){
                System.out.println("ORTADAKI karakter :"+str.charAt(str.length()/2));
            }else
                System.out.println("yanlis kelime girdiniz");

        }while (!(str.length()%2==0));
        System.out.println("yanlis kelime girdiniz");
    }

}
