package day11_StringManipulation;

public class C07_StarsWith {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));
        System.out.println(input.startsWith("gectikce", 9));

    }
}
