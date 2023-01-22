package OrnekSorularARRAYS_slymn;

public class soru_ArraysList {//soru; bir tane mda olusturunuz
    //bu array deki tum sayilarin toplamini veren kodu yaziniz
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,6},{8,7}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr [i].length ; j++) {

                sum=sum+arr[i][j];




            }

        }  System.out.println(sum);


    }
}
