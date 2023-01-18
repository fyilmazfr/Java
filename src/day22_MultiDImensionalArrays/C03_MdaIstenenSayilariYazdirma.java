package day22_MultiDImensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {/* verilen 2katli mda array'de outer index'i ve inner index'i ayni olan
sayilarin toplamini bulunuz
    int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
    [0][0]+[1][1]+[2][2]....*/

    public static void main(String[] args) {
        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};//kac katli ise o kadar katli foorLoop olusturmak zorundasiniz
         int istenenToplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {//2. kat
                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }

            }

        }
        System.out.println("istenenToplam:" + istenenToplam);// 1'in 1'i=1, 2'nin 2 si =5,3'un 3 u =6
        //cunku length kelle sayar buyuzden 1,2,3 diye sayar
        //toplami 12 eder
    }
}
