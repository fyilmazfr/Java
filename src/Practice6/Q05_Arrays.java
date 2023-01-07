package Practice6;

import java.util.Arrays;

public class Q05_Arrays {//verilen bir int dizisi icin elemanlarin karelerini bulun

    public static void main(String[] args) {
        int arr[]={2,6,4,5,8,9};

        for (int i = 0; i <arr.length ; i++) {
            //arr[i]*=arr[i];//carpim yaptik
            arr[i]*=arr[i];


        }

        System.out.println(Arrays.toString(arr));
    }
}
