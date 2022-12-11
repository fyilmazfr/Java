package EKSTRA_SORULAR;

public class C14_KelimeIcindeHarf {// //Java bir kelime içindeki harflerin kaç defa tekrar ettiğini bulacağız.

    public static void main(String[] args) {
        String input="hey hey de hey hey";
        String cumle=input;
        char harf = 'h';// bu degeri degistirebiliriz

        int sayac=0;
        for (int i = 0; i <input.length() ; i++) {
            if(cumle.charAt(i) == harf)

            sayac++;
        }
        System.out.println(sayac+" "+ "tane" +" "+ harf+" " +"harfi " + "vardir");





        }}




