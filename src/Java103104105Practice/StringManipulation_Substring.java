package Java103104105Practice;

public class StringManipulation_Substring {
    /*
    substring belli ifadeler arasini almamiza yarar
    yada tek deger girersek o degerden itibaren sonuna kadar alir
     */
    public static void main(String[] args) {
        String str="Her dert java gibi olsa";
        // 10.index dahil sonuna kadar yazdir
        System.out.println(str.substring(10));//ava gibi olsa


        //son 10 harfi yazdirin
        System.out.println(str.substring(str.length()-9));//gibi olsa

        //ilk 10 karakteri almayalim
        System.out.println(str.substring(0,10));//Her dert j

        //11.karakterden sonuna kadar olan String'i yazdiralim
        System.out.println(str.substring(10));//ava gibi olsa


    }
}
