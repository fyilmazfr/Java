package Practice6;

import java.util.Scanner;

public class Q11_stringPINkodu {/* string olan pin kodunuzu kontrol eden bir kod yaziniz*/

    public static void main(String[] args) {
        String pin = "fatih";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("hosgeldinizzzzzz");

        while (true) {// kodumuz dogru oldugu surece calissin demek isteriz true ile
            System.out.println("pin kodu giriniz");
            String girilenPIN = scan.nextLine();

            if (pin.equals(girilenPIN)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz :" + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("puk kodu giriniz,bloklandiniz");
                break;
            }
        }

    }}
