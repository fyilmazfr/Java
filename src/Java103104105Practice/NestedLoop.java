package Java103104105Practice;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//satirlar
            for (int j = 1; j <=9 ; j++) {//sutunlar


                if ((i==1 && j==5) || (i==2 && (j==4 || j==6)) ||(i==3 && (j==3 || j==7)) || (i==4 &&(j==2 || j==8))||i==5){
                    System.out.print("*");
                }//i birinci satiradyken j 5 olmali
                //i ikinci satirdayken j 4 ve 6 da olmali...
                else System.out.print(" ");//degilse heryere bosluk koysun

        }
            System.out.println();//her defasinda forrlopp bitikten sonra gorunum icin bir alt satira gec
    }

}}
