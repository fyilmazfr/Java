package Practice1;

public class Q07_Converting {
    /* GALONU LITREYE CEVIREN BIR JAVA PROGRAMI YAZINIZ
    1 gallon=3.785 litre
    litreyi galona ceviren bir program yaziniz
    1 litre=1/3.785 gallon
    
    
    // sicakligi fahreneyttan santigrat derecesine ceviren bir java program yazin
    formul c=(f-32)*5/9
     */
    public static void main(String[] args) {
        int gallon=1000;
        double litre=gallon*3.785;
        String SONUC1="gallon DEGERI"+ litre+ "LITREYE ESITTIR";
        System.out.println("SONUC1 = " + SONUC1);
    }
}
