package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("kayra");

        sb.substring(0,3);//kayra
        //bu method string dondurdugu icin string builder'in eski halini degistirmez
        System.out.println(sb);//kayra

        sb.subSequence(0,3);
        System.out.println(sb);//kayra



    }
}
