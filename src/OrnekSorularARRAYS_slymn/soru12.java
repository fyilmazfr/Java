package OrnekSorularARRAYS_slymn;

public class soru12 {//bir mda 'daki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz

    public static void main(String[] args) {
        int[][] arr = {{2, 5, 1}, {83, 75}};
        int maxelement=arr[0][0];
        int minelement=arr[0][0];
        for (int [] w:arr) {
            for (int k:w) {
                maxelement=Math.max(maxelement,k);
                minelement=Math.min(minelement,k);


            }

        }
        System.out.println(maxelement);
        System.out.println(minelement);
        System.out.println(maxelement+minelement+"=max ve min sayinin toplami");

        }

        }





