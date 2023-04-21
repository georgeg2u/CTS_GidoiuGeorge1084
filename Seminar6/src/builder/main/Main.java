package builder.main;

import builder.clase.Pacient;
import builder.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
            //ex 1 din pdf
        PacientBuilder pacientBuilder = new PacientBuilder("Ion");
        Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPatRabatabil(true).setPapuciDeCamera(true).build();
        Pacient pacientNou = new PacientBuilder("Maria").build();
        Pacient pacientNou2 = new PacientBuilder("Vasile").setMicDejunInclus(true).setPatRabatabil(true).build();
        Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).setNume("Ana").build();

        System.out.println(pacient.toString());
        System.out.println(pacientNou.toString());
        System.out.println(pacientNou2.toString());
        System.out.println(pacientNou3.toString());


    }
}
