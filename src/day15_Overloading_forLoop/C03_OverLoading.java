package day15_Overloading_forLoop;

public class C03_OverLoading {
    public static void main(String[] args) {

        toplam(5,7);
        toplam(5.2,3);
        toplam(3.4,6.1);
    }

    public static void toplam(int i, int i1) {
        System.out.println("iki degerin toplami :" +(i +i1));
    }
    public static void toplam(int i, double i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" +(i + i1));

}
    public static void toplam(double i, int i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" +(i + i1));

}
    public static void toplam(double i, double i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" + (i + i1));
    }}