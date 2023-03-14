package main;

import register.Firma;
import register.Registru;

public class Program {
    public static void main(String[] args) {
        //singleton registry -> asigura unicitatea
        Registru registru = new Registru();
        Registru registruNou = new Registru();

        Firma firma1 = registru.getFirma("SC O FIRMA SRL");
        Firma firma2= registru.getFirma("SC ALTA FIRMA SRL");
        Firma firma3 = registru.getFirma("SC O FIRMA SRL");

        firma1.angajeaza();
        firma2.angajeaza();
        firma3.angajeaza();

        System.out.println(firma1.toString());
        System.out.println(firma2.toString());
        System.out.println(firma3.toString());

//        Firma firma4 = new Firma(4, "SC O FIRMA SRL");
//        System.out.println(firma4.toString());

    }
}
