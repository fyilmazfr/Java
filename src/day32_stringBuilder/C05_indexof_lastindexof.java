package day32_stringBuilder;

public class C05_indexof_lastindexof {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println("sb.indexOf(\"Pay\") = " + sb.indexOf("Pay"));// 0
        //array mantigiyla calistigi icin ilk index'i pay ,yani 0.index

        System.out.println(sb);//Pay attention please

        System.out.println(sb.indexOf("e"));//7
        System.out.println(sb.indexOf("e",10));//16


        System.out.println(sb.lastIndexOf("e"));//19 ,,,,sondan itibaren ilk e harfine bakar fakat index numarasini verirken bastan itibaren soyler

        System.out.println(sb.lastIndexOf("e",10));// 7,,,10.index'e gider  ordan geriye dogru sayar ve ilk e harfini bulur ve onun index'ini soyler



    }
}
