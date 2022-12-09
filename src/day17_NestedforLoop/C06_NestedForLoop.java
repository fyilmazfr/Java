package day17_NestedforLoop;

public class C06_NestedForLoop {// verilen stringi asagidaki gibi yazdiran bir program yazdirin

    public static void main(String[] args) {
       String input="deniz";
        for (int i =1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
    }
}
