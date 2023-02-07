package day32_stringBuilder;

public class C02_Append_Insert {

    public static void main(String[] args) {
        //APPEND istedigimiz seyi en sona ekler ister rakam ister isaret ister sring yazin onemli deegil

        StringBuilder sb=new StringBuilder("java daha ne yapsin");

        sb.append("?");
        System.out.println(sb);//java daha ne yapsin?

        sb.insert(4," herseyi dusunmus");
        System.out.println(sb);//java herseyi dusunmus daha ne yapsin?

        //ARAYA EKLEME yapmak istedigimizde append degil insert kullanmaliyiz



    }
}
