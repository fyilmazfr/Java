package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi=10;


        System.out.println("pre-increment:" + ++sayi); // ONCE ARTIR ,sonra ata 11

        System.out.println("post-increment:" + sayi++); //ONCE ATA SONRA ARTIR 11

        System.out.println("post-increment'den sonra :" + sayi); //12
        // pre ve post increment veya decrement da sayi her halukarda artacak veya azalacak ama ne zaman?
        // BURADA ONEMLI OLAN bu
    }}

