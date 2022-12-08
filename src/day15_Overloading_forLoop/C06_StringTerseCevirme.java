package day15_Overloading_forLoop;

public class C06_StringTerseCevirme { // input olarak verilen stringi terse cevirip yazdiran bir method olusturun

    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        terstenYazdir(input);

    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) { // index 0 olana kadar ve azalarak gidecek cunku tersten gidiyor

            tersInput+=input.substring(i,i+1); // her i degerini al ve tersinput kasamiza at diyoruz.
            //i+1  yani harfin sag kismini alma, soldan devam et diyoruz

        }
        System.out.println("Java gun gectikce guzellesiyor kelimesinin tersten yazimi:"+"\n" +tersInput);
    }
}
