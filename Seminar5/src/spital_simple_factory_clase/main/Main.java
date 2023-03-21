package spital_simple_factory_clase.main;

import spital_simple_factory_clase.Asistent;
import spital_simple_factory_clase.Factory;
import spital_simple_factory_clase.PersonalSpital;
import spital_simple_factory_clase.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Anghel Adrian");
        PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Medeea Ionescu");
        PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER, "Brancus Daniel");

        asistent.descriere();
        medic.descriere();;
        brancardier.descriere();
        System.out.println("\n");

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(asistent);
        listaPersonal.add(medic);
        listaPersonal.add(brancardier);
        listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Doctorescu Donald"));
        listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Brancardiescu Brancoveanu"));
        listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Asistentovici Asistache"));

        listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Anastasia Anestezia"));

        for(PersonalSpital personal: listaPersonal){
            personal.descriere();
        }
    }
}
