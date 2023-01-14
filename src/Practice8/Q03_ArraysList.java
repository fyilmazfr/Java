package Practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArraysList {/*verilen array'in n sayisi kadar maksimum degerlerini bulan java programi yaziniz
    not :kisa methodlar kullanmayiniz
    input:{1,2,3,4,5,6,7,8}      orn; 2 en buyuk   INPUT n:2    output:7 and 8  */

    public static void main(String[] args) {
        int [] arr={2,5,3,56,56,-78,32,24,12,0};
        int n =4;
        List<Integer>list=new ArrayList<>();
        //listeye elemanlari ekleyelim
        for (int each:arr) {
            list.add(each);

        }
        List<Integer> maxList=new ArrayList<>();
        int count=1;
        while (count<=n){
            int max=list.get(0); //list in ilk elemani max olsun
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max){//listenin herhangi bir elemani max dan buyukse
                    max= list.get(i);

                }

            }
            maxList.add(max);
            list.remove(list.indexOf(max));//tekrari onlemek icin ayni sayiya bakmamak icin listeden kaldiriyoruz
            count++;
        }
        System.out.println("Array'in max"+" "+n+"elemani"+maxList);






        }

    }

