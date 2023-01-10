package Practice7;

public class Q04_Arrays {/*verilen bir cumlede bosluklar haric  karakter sayisini bulunuz
cumle: verilen bir cumledeki bosluklar haric karakter sayisini bulunuz */

    public static void main(String[] args) {
        String str="verilen bir cumledeki bosluklar haric karakter sayisini bulunuz ";
        str=str.replace(" ","");
        System.out.println(str);
        System.out.println("karakter sayisi :"+str.length());

        //yada array icin
        String harf[]=str.split("");//bu sekilde de cozebiliriz, boslukdan bol
        System.out.println(harf.length);

    }
}
