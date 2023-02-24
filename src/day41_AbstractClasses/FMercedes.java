package day41_AbstractClasses;

public class FMercedes extends DAraba {
    @Override
    protected void yakit() {
        /*Abstract bir parent'in concrate child class inherit ederse parent abstract class'ddaki tum abstract
        method'lari override etmek zorundadir.
        Abstract bir class, abstract baska bir class'i parent edinirse parent class'daki tum abstract methodlari
        override etmek ZORUNDA degildir.
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
