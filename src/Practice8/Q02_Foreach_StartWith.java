package Practice8;

public class Q02_Foreach_StartWith {
    public static void main(String[] args) {
        String[] list={"fruits", "vegetables","meat" , "milk"};
        for (String each:list) {
            System.out.print(each+"=uzunlugu:"+each.length()+" ");

        }// soruda v ile baslayan element varsa forloop dan cik diyor
        System.out.println();
        for (String each:list) {
            if (each.startsWith("v")){//bu method ile v ile basliyorsa dedik
                break;
            }
            System.out.println(each);//sadece fruits yazdirdi

        }
    }
}
