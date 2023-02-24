package day41_AbstractClasses;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /* corolla class'in  2 tane Parent'i var ,corolla parent'larini ikisinin de standartlarina '(abstract method)
    uymak zorundadir.Concrate bir class parent'i olan tum abstract clas'larda abstract olan method'lari implement
    etmek ZORUNDADIR.
    Ancak parent silsilesinde override edilerek concrete yapilan methodlari override etmek zorunda degildir.
     */
}
