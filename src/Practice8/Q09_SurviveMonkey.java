package Practice8;

public class Q09_SurviveMonkey {/*bir ada bir maymun var ve hergun 4 muz'a ihtiyaci var toplam da 165 muz var
ve bu maymun toplamda kac gun yasayabilir*/

    public static void main(String[] args) {
        int numberofBananes=165;
        int survivalDays=0;//0. gun olmaz BURAYA 1 yazilmali
        boolean monkeyAlive=true;


        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberofBananes-=4;//toplam muzdan 4 azalir
            survivalDays++;//yasadigi gun sayisini 1 arttir
            if (numberofBananes<4){//4ten az muz kalirsa
                monkeyAlive=false;// maymun hayatta degil
                System.out.println("bugun "+survivalDays+".gun VE muz kalmadi,maymun sizlere omur ::((");

            }else {
                System.out.println("bugun"+survivalDays+". gun ve maymun halen hayatta..");
            }

        }while (monkeyAlive);//maymun hayatta kaldigi surece
        System.out.println("toplam yasadigi gun sayisi :"+(survivalDays-1));
    }
}
