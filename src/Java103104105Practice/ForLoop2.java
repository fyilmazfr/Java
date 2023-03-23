package Java103104105Practice;

public class ForLoop2 {
    /*
    kullanicidan bir cumle ve bir harf alin
    cumlede verilen harfin kac kere kullanildigini bulup yazdirin

     */
    public static void main(String[] args) {
        String input="Java ogrenmek cok guzel";
       char HARF='e';
       int sayac=0;

        for (int i = 0; i <input.length() ; i++) {

            if (input.charAt(i)==HARF){
                sayac++;
            }
        }
        System.out.println("girdiginiz cumlede "+HARF+ " harfi "+sayac+ "tanedir");

        }


    }

