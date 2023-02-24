package day41_AbstractClasses;

public abstract class EToyota extends DAraba{
    @Override
    protected void motor() {
        System.out.println("toyota arabalar cevrec motor kullanir");

    }
    /*parent class'daki standart belirleyici method'lar (abstract method)'larin tamami child class tarafindan
    override edilmelidir.
    Concrete methodlarin override edilme mecburiyeti yoktur.Istersek override edebiliriz,istemezsek etmeyiz
    Aslinda Toyota class'i obje uretecegimiz bir class degil bu durumda eger proje tasarimi yapiyorsaniz Toyota
    class'ini da abstract yapmaniz guzel olur.

     */
}
