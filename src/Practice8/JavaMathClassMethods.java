package Practice8;

import java.util.Random;

public class JavaMathClassMethods {
    public static void main(String[] args) {
        int a=-12;
        int b=4;
        System.out.println("a nin mutlak degeri="+ Math.abs(a));
        System.out.println("a ve b den buyuk olani="+Math.max(a,b));
        System.out.println("2,6,8 den en buyuk olani ="+Math.max(2,Math.max(6,8)));
        System.out.println("a ve b den en kucuk olani="+Math.min(a,b));
        System.out.println("b nin kare koku="+Math.sqrt(b));
        System.out.println("2 nin 3. kuvveti="+Math.pow(2,3));
        System.out.println("round 3.1'i yuvarla ="+Math.round(3.1));
        System.out.println("round 3.5 i yuvarla="+Math.round(3.5));
        System.out.println("3.1 sayisini ust tamsatiya yuvarlama="+Math.ceil(3.1));
        System.out.println("3.5 SAYISINI UST TAM SAYIYA yuvarlam="+Math.ceil(3.5));
        System.out.println("3.1 sayisini  alt tam sayiya yuvarlama="+Math.floor(3.1));
        System.out.println("3.5 SAYISINI  alt sayiya yuvarlama="+Math.floor(3.5));

            //random() methoduyla rastgele deger uretme
        double doubleSayi=(int)(Math.random()*100);
        System.out.println("double sayi="+doubleSayi);

        //int degerler uretme
        int intSayi=(int)(Math.random()*100);
        System.out.println("intSayi="+intSayi);


        int max=20;
        int x=(int) (Math.random()*max);//20 YE KADAR DEGER URETSIN
        int y=(int) (Math.random()*max);
        System.out.println("x value is="+x);
        System.out.println("y value is="+y);
        if (x<y){
            System.out.println(x+"=is the minimum number");

        }else{
            System.out.println(y+"is the minimum number");
        }

        //java math.RANDOM kullanimi
        for (int adet = 0; adet <5 ; adet++) {
            System.out.println("java math random sayi:"+Math.random());//5 adet sayi uretti double

        }

        //java util random kullanimi
        Random rnd=new Random();
        for (int adet = 0; adet <5 ; adet++) {
            int rSAYI= rnd.nextInt(1000);
            System.out.println("java util random sayisi="+rSAYI);//araligi 1000 OLAN 5 adet sayi uretti


        }




    }
}
