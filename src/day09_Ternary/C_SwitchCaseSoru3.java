package day09_Ternary;

import java.util.Scanner;

public class C_SwitchCaseSoru3 {
    //KULLANICI S GIRERSE SOFTWARE
    //D DEVELOPER
    //ENGINEER
    //T IN TESTING
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf secin");
        char HARF=scan.next().charAt(0);


        switch (HARF) {
            case 's':
                System.out.println("software");
                break;
            case 'd':
                System.out.println("developer");
                break;
            case 'e':
                System.out.println("engineer");
                break;
            case 't':
                System.out.println("in testing");
            default:
                System.out.println("gecerli harf girin");



        }
    }
}
