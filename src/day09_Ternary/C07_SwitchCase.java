package day09_Ternary;

import java.util.Scanner;

public class C07_SwitchCase { // kullanicidan gun ismini alin hafta ici veya hafta sonu oldugunu yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun giriniz");
        String gun= scan.nextLine();

        switch (gun){
            case "pazartesi":

                System.out.println();// tekra tekra hafta icide yazmadik cunku cumaya kadar ayni yazdiracak
            case "sali":
                System.out.println();
            case "carsamba":
                System.out.println();
            case"persembe":
                System.out.println();
            case "cuma":
                System.out.println("hafta ici");// cumaya kadar hafta ici yazdiracagi icin break koymadik aralara
                break;

            case "cumartesi":
                System.out.println("hafta sonu");
            case  "pazar":
                System.out.println("hafta sonu");
            default:
                System.out.println("gecerli bir gun giriniz");



        }
    }
}
