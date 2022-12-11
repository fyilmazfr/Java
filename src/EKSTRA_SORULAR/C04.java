package EKSTRA_SORULAR;

public class C04 {//Bu örneğimizde 5x5 lik Çarpım Tablosu Oluşturacağız.

    public static void main(String[] args) {
        for (int i= 1; (i) <5 ; (i)++) {
            for (int j = 1; j <5 ; j++) {
                System.out.print(i*j+ " ");
               // System.out.print("*"); istersem usteki satiri siler 9.satiri yazarim ve yildiz gibi gozukur

            }

            System.out.println("");// bir alt satir icin bunu yapiyorum,temiz gozukmesi icin
        }
    }
}
