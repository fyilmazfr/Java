package day15_Overloading_forLoop;

public class C07_1_ForLoop {// 100 den 1 e kadar 8 ile bolunebilen sayilari yazdirin

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ,");

            }

        }
    }}
