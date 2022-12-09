package day16_ForLoop;

public class C01_ForLoop {// verilen bir pozitif tam sayinin tam bolenlerini yazdirin

    public static void main(String[] args) {
        int input = 30 ;



        for (int i = 1; i <= input; i++){// burda toplama yad acarpma yapmayacagimiz icin herhangi bir kasa olusturmayacagiz
                                           // 1 den baslamali inputa kadar gitmeli ve birer birer artmali
            if (input % i == 0) {
                System.out.print(i+" ,");



            }

        }





    }
}
