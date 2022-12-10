package day17_NestedforLoop;

public class C07_1_WhileLoop {// 20 DEN 50 YE KADAR CIFT SAYILARI YAZDIRALIM

    public static void main(String[] args) {
        int bas=20;
        int bitis=50;
        int temp=bas;
        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp+" ,");

            }
            temp++;
        }
    }
}
