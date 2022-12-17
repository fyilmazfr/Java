package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi=10;
        //System.out.println(sayiMethod); sayiMethod method 1 de olusturulmus local bir variabledir.
        for (int i = 0; i <=20 ; i++) {
            System.out.print(i);

        }
        //System.out.println(i); i loop da olusturulmus local variables dir sadece loop icerisinde kullanilabilir

       // static int sayiStatic=20; static keyword sadece class  level da kullanilabilir
        //method larin icerisinde static variable tanimlanamaz.
    }



    public static void method1(){

        //System.out.println(sayi); Sayi main method da olusturulmus local bir variabledir
        //sadece main method da gecerlidir

        int sayiMethod=20;
    }

}
