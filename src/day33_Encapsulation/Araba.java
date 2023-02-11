package day33_Encapsulation;

public class Araba {/*ENCAPTULATION DATA HIDDINGDIR YANI;
    data yi saklamaktan ziyade datanin erisim yetkilerini bildirmek veya otorisation yapiyoruz
    */
    String marka = "marka belirtilmedi";//marka'nin access modifier'i default access modifier oldugundan package icerisinde kullanilabilir
    private String model = "model belirtilmedi";
    private String yakit = "elektrikli";//tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variablelarina erisimi yetkilendirelim
    //model'e deger atanabilsin ama gorulemesin(setter)
    // YAKIT ISE gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    //bunun icin

    public void setModel(String model) {//setter methodunu generate'den model'i secerek java bize method  olusturdu
        this.model = model;

    }

    public String getYakit() {
        return yakit;
    }

}
