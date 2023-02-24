package day41_AbstractClasses;

public abstract class DAraba {
    public static void main(String[] args) {/* main method:abstract class'da main method opsiyoneldir.Eger abstract class sadece
   class sadece  child class'larin tasimak zorunda oldugu ozellikleri belirlemek icin o lusturulduysa main method'a ihtiyac olmaz
     sadece abstract method'lar olur.Ama bir abstract method'da standart belirlemek disinda da method'lar calisabilir.
     Bu durumda ihtiyac olursa main method olusturulabilir.
     */


    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
    /* Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar abstract method olur ve
    abstract'larin body'si olmaz.
     */
    public void klima(){
        System.out.println("bazi arabalarada klima olabilir");
        /* abstract olmayan method'lara concrete method denir.abstract bir method'u abstract keyword ile belirlemek ZORUNLUDUR
        concrate methodlar'da bunun deklare edilmesine gerek yoktur.biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz.
         */
    }
}
