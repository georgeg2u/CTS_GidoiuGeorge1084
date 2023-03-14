package register;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private Map<String, Firma> registru = new HashMap<>();



    public  Firma getFirma(String nume){
        if (!registru.containsKey(nume)){
            Firma firma = new Firma(0, nume);
            registru.put(nume, firma);
        }
        return registru.get(nume);
    }
}
