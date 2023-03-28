package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
    private String nume;
    private Map<String, Float> solutii = new HashMap<>();
    private float gramaj;

    public Reteta(String nume, Map<String, Float> solutii, float gramaj) {
        this.nume = nume;
        this.solutii = solutii;

        float sum = 0;
        for(float cantitateSolutie :solutii.values()){
            sum +=cantitateSolutie;
        }

        if(sum==gramaj){
            this.gramaj = gramaj;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSolutii(Map<String, Float> solutii) {
        this.solutii = new HashMap<>();
        for(String key: solutii.keySet()){
           this.solutii.put(key, solutii.get(key));
       }
    }

    public void setGramaj(float gramaj) {
        this.gramaj = gramaj;
    }

    private Reteta() {
        this.nume = "NotApplicable";
        this.gramaj =0;
        this.solutii = null;
    }

    @Override
    public IReteta copiaza() {
       Reteta retetaNoua = new Reteta();
       retetaNoua.setNume(nume);
       retetaNoua.setSolutii(solutii);
       retetaNoua.setGramaj(gramaj);

       return retetaNoua;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                ", gramaj=" + gramaj +
                '}';
    }
}
