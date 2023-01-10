package Practice7;

public class Q03_MDArray {/*girilen md arraydaki cift sayilari toplayan bir method yaziniz
*Input: {{1,3,6},{2,8}, {5,7,9,14}}
*
output : arraydaki cift sayilarin toplami:30 */

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        System.out.println("ciftleriTopla(arr) = " + ciftleriTopla(arr));
    }


    public static int ciftleriTopla (int[][] arr) {
            int toplam=0;

        for (int [] each1:arr){ //outer for each
            for (int each2:each1){

              if (each2%2==0){
                  toplam+=each2;
              }

                }

            }
            System.out.println(toplam);
        return toplam;
    }
        }


