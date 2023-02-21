package day38_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {/*
    bir sorunla karisilasmayi beklediginiz noktalarda if else ile bu sorunu cozebilirsiniz
    ama sorunu her zaman bu sekilde cozemeyecegimizden Java try-catch bloklari olusturmustur.*/
        //int a=10;
      //  int b=0;
        //System.out.println(a/b);//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at day38_Exceptions.C01_Exceptions.main(C01_Exceptions.java:7)
         int c=100;
         int d=50;
         int sayac=1;

         while (sayac<1000){
             System.out.print(c/d);//222222222222222233333333444445555667789101112141620253350100Exception in thread "main" java.lang.ArithmeticException: / by zero
             //at day38_Exceptions.C01_Exceptions.main(C01_Exceptions.java:14)

            // Process finished with exit code 1


             d--;
             sayac++;
         }


    }
}
