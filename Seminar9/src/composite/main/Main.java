package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Item meniu=new Sectiune("Meniu restaurant");
        Item sectiuneBauturi=new Sectiune("Bauturi");
        Item sectiuneStartere=new Sectiune("Startere");
        Item subsectiuneCafele=new Sectiune("Cafele");
        Item subsectiuneSucuri=new Sectiune("Sucuri");
        Item produsCafeaNEagra=new Produs("Cafea neagra");
        Item produsCapuccino=new Produs("Capuccino");
        Item produsCocaCola=new Produs("Cocacola");
        Item produsMirinda=new Produs("Mirinda");
        Item produsApaPlata=new Produs("ApaPlata");
        Item produsBruschete=new Produs("Bruschete");

        try{
            subsectiuneCafele.adaugareItem(produsCafeaNEagra);
            subsectiuneCafele.adaugareItem(produsCapuccino);

            subsectiuneSucuri.adaugareItem(produsCocaCola);
            subsectiuneSucuri.adaugareItem(produsMirinda);

            sectiuneBauturi.adaugareItem(subsectiuneCafele);
            sectiuneBauturi.adaugareItem(subsectiuneSucuri);
            sectiuneBauturi.adaugareItem(produsApaPlata);

            sectiuneStartere.adaugareItem(produsBruschete);

            meniu.adaugareItem(sectiuneBauturi);
            meniu.adaugareItem(sectiuneStartere);

            meniu.descriere("    ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
