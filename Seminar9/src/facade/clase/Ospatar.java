package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private List<Integer> meseDebarasate;

    public Ospatar() {
        meseDebarasate=new ArrayList<>();
    }
    public boolean esteDebarasata(int nrMasa){
        return meseDebarasate.contains(nrMasa);
    }
    public void debaraseaza(int nrMasa){
        if (!meseDebarasate.contains(nrMasa)){
            meseDebarasate.add(nrMasa);
        }
    }
}
