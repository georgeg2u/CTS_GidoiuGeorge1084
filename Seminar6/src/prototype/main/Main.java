package prototype.main;

import prototype.clase.IReteta;
import prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //ex 4 pdf
        Map<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("solutia1", (float)20);
        solutii.put("solutia2", (float)10);
        solutii.put("solutia3", (float)30);
        IReteta prototype = new Reteta("Reteta", solutii, 60);
        Reteta farmacie = (Reteta)prototype.copiaza();
        farmacie.setNume("Reteta farmaciei");
        Reteta laborator = (Reteta)prototype.copiaza();
        laborator.setNume("Reteta alboratorului");

        System.out.println(farmacie.toString());
        System.out.println(laborator.toString());
    }
}
