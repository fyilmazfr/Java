package OrnekSorularARRAYS_slymn;

public class soru_Arrays_FOREACH {//soru; bir tane mda olusturunuz
    //bu array deki tum sayilarin toplamini veren kodu yaziniz
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,6},{8,7}};
        int sum=0;

        for (int [] w:arr) {
            for (int k:w) {//ikinci inner da artik array in icnide degiliz bu yuzden arrys isareti koymuyoruz
                sum=sum+k;

            }

        }
        System.out.println(sum);
    }
}
