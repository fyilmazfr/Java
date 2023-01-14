package Practice8;

public class Q05_MdArrays {/*
int arr[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen array icinde
kac tane eleman oldugunu return eden methodu yazdiriniz //cevap:13 donsun */

    public static void main(String[] args) {
        int arr[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println("elemanSayisi(arr) = " + elemanSayisi(arr));//sout u bir alt satir kismina da yazabiliriz


    }

    public static int elemanSayisi(int[][] arr) {
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {//outer for
            for (int j = 0; j <arr[i].length ; j++) {//inner for
                sayac++;

            }

        }



        return sayac;
    }


}
