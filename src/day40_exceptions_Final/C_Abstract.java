package day40_exceptions_Final;

public abstract class C_Abstract {
    void  toplama(){
        System.out.println("bu method toplama yapar");
    }
    abstract void carpma();
    abstract void bolme();

    void cikarma(){
        System.out.println("bu method cikarma yapar");
        //hem abstract yazip hemde body olusturamayiz, ikisinden birinden vazgecmemiz lazim.
    }

    /*TSI standdartlari belirler ama kendisi ekmek degildir.
    Bir method'un child class'lar icin bir standart oldugunu declare ederiz.Ve method body'sine ihtiyac kalmaz.

     */
}
