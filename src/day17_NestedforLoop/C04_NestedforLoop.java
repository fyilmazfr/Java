package day17_NestedforLoop;

public class C04_NestedforLoop {// bir onceki soruyu ucgen bir sekilde yapalim

    public static void main(String[] args) {
        int input =4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {// ucgen yaparken j<i den yapiyoruz
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
