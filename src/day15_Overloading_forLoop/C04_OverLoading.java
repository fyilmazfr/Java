package day15_Overloading_forLoop;

public class C04_OverLoading { // C03 clasini copy paste yaparak aldik ve
    // toplam degerine yeni variable atadik ve hata vermedi neden?
    public static void main(String[] args) {
        toplamy(5,6.2); // java 2.methoda bakar ve hangi methodun calisacagina karar verirken optimizasyon yapar
        // eger hic cast yapmadan kullanabilecegi bir method yoksa ,en az cast yaparak kullanabilecegi methodu tercih eder

    }
    public static void toplamy(int i, int i1) {
        System.out.println("iki degerin toplami :" +(i +i1));
    }
    public static void toplamy(int i, double i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" +(i + i1));

    }
    public static void toplamy(double i, int i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" +(i + i1));

    }
    public static void toplamy(double i, double i1) { // parametrreleri degisritdik ve java itiraz etmedi
        System.out.println("iki degerin toplami :" + (i + i1));
}}
