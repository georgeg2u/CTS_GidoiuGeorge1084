package spital_factory_method_clase.main;

import spital_factory_method_clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fabricaAsistenti = new FactoryAsistent();
        Factory fabricaMedici = new FactoryMedic();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(fabricaAsistenti.createPersonal("Asistescu"));
        listaPersonal.add(fabricaAsistenti.createPersonal("Asistancu"));
        listaPersonal.add(fabricaMedici.createPersonal("Doctorescu"));

        Factory fabricaAnestezisti = new FactoryAnestezist();
        listaPersonal.add(fabricaAnestezisti.createPersonal("Anestezescu"));


        Factory fabricaInfirmieri = new FactoryInfirmier();
        Infirmier infirmier = (Infirmier) fabricaInfirmieri.createPersonal("Ifrim");
        infirmier.setAniVechime(5);
        listaPersonal.add(infirmier);

        for(PersonalSpital personal: listaPersonal){
            personal.descriere();
        }
    }
}
