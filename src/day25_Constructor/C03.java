package day25_Constructor;

public class C03 {/* proje olustururken bazi claslar run etmek icin degil
variable ve method olusturup
bunlari baska claslardan kullanmak icin olusturulur
*/
    //default constructor parametresizdir goremesek bile ihtiyac halinde calisir
    // DEFAULT constructor cok kiskactir , java baska bir constructor gordugunde bir daha eski constructor  kullanmaz
//default cons. JAVA OLUSTURUR benim olusturdugum artik default const olmaz

C03(){

}



    // OLUSTURDUGUMUZ PARAMETRESIZ BU CONSTRUCTOR default constructor ile 1-1 aynidir
    //ama BIZ OLUSTURDUGUMUZ ICIN BUNA DEFAULT CONSTRUCTOR DEMEYIZ PARAMETRESIZ CONS; DERIZ

    String isim="Etka";
    public void method(){
        System.out.println("C03 method calisti");
    }
}
