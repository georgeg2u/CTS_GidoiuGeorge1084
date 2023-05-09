package state.clase;

public class StareOcupata implements Stare{

    @Override
    public void schimbaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareOcupata)){
            masa.setStare(this);
            System.out.println("Masa " + masa.getNumar() + " a fost ocupata.");
        }
        else {
            System.out.println("Masa nu poate fi ocupata.");
        }
    }
}
