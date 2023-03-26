package Java103104105Practice;

public class Arrays {
    /* asagidaki multi dimensional arraylerin ic arraylerinde
    ayni indexe sahip elemanlarin toplamini yazdiran bir program yazin
    int arr1[][]={{1,2},{3,4,5},{6}};
    int arr2[][]={{7,8,9},{10,11},{12}};
     */
    public static void main(String[] args) {
        int sinir=0;
        int toplam=0;
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};

        if (arr1.length<=arr2.length){
            for (int i = 0; i <arr1.length ; i++) {
                sinir=arr1[i].length;
                if (arr1[i].length>arr2[i].length){
                    sinir=arr2[i].length;
                }
                for (int j = 0; j <sinir ; j++) {
                    toplam=arr1[i][j]+arr2[i][j];
                    System.out.println(i+","+j+"+indexindeki elemanlarin toplami"+toplam);

                }

            }



        }else {
            for (int i = 0; i <arr1.length ; i++) {
            sinir=arr1[i].length;
            if (arr1[i].length>arr2[i].length){
                sinir=arr2[i].length;
            }
            for (int j = 0; j <sinir ; j++) {
                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(i+","+j+"+indexindeki elemanlarin toplami"+toplam);

            }

        }

        }






    }
}
