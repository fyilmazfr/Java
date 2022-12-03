package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C01_MethodCreation {// soru: input olarak verilen 4harfli bir stringi tersten yazdiran bir method olusturalim

    public static void main(String[] args) {
        terstenYAZDIR("MEVA");
        terstenYAZDIR("AKIF");

        //Istersek daha onceden bir onceki klasdan bir method yapmistik onu cagiralim ornek amacli
        C04_MethodCreation.topla(6,10);


    }public static void terstenYAZDIR(String input){

        String tersInput=input.substring(3)+ input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.println("verilen kelimenin tersten yazilisi:" +tersInput);
        // burda main method kisminda gordugumuz gibi bir kod yok fakat method creationumuzu tamamladik
        //Simdi bunu yukarda yazdirmamiz icin bu method creationumuzu cagirmamiz lazim
        //bunuda su sekilde yapariz  ust kisma yani main method kismina ;tesrtenyazdir( input "fatih" yazariz
    }
}
