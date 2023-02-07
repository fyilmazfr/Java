package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        //verilen bir inputu tersine cevirip bize donduren bir method olusturun

        String input="hey gidi foor loop gunleri";

        String tersInput=tersineCevir(input);
        System.out.println(tersInput);//irelnug pool roof idig yeh

    }

   public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);//yeni bir stringbuilder yaptik ve iinede inputu koyduk

        return sb.reverse().toString();// normalde java bunu kabul etmez ama .toString yaparak sutringbuilder a cevirdik



    }


}
