package day24_arraylist_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {/*uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine array
   olusturup bunlari liste cevirmek daha pratik olabilir demistik
    1-LOOP ile arraydeki tum elementleri list'e atabiliriz
    2-Array.aslist() kullanabiliriz
    ancak bu method'un 2tane kotu yan etkisi var
    array class'i 'kullanildigi icin array ozellikleri gecerli olur dolayisyla list'te olan add , remove gibi size'i
    degistiren method'lar bu sekilde olusturulan list'lerde kullanilmaz
    -kaynak olan array ile urun olan list ozdeslestirilir birinde yapilan degisiklik otomatik olarak digerine de islenir
    */

    public static void main(String[] args) {
        String[] arr={"ismail","nurullah","fatih"};
        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);

       //1.yan etki
        //sinifList.add("erdi");//ekleme yaptik ama calistirdigimizda hata veriyor
        //sinifList.remove(1);//yine hata verdi
        //2;Yan etki
        arr[1]="emre";
        System.out.println(Arrays.toString(arr));//degisim sonrasi array,[ismail, emre, fatih]
        System.out.println(sinifList);//array'i degistirince list,[ismail, emre, fatih]

        sinifList.set(0,"utku");
        System.out.println(sinifList);//[utku, emre, fatih]list'i degistirince list
        System.out.println("listi degistirince array:"+Arrays.toString(arr));//[utku, emre, fatih]

    }
}
