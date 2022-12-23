package day22_MultiDImensionalArrays;

public class C05_MdaSonElemanlariCarpma {//asagidaki mda in ic arraylerinde ki son elemanlarin carpimini
    // ekrana yazdiran bir program yaziniz
    public static void main(String[] args) {
        int[][] arr={ {1,2,3}, {4,5}, {6} };//eger bir mda varsa gozumuz kapali i ve j for loop u olusturun
        int carpim=1;


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j== arr[i].length-1){// j'nin son elemaniysa
                    carpim*=arr[i][j];
                }

            }

        }
        System.out.println("son elemanlarin carpimi:"+carpim);//90 Yazdirdi  3*5*6

    }
}
