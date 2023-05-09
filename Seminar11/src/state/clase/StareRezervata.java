package state.clase;

public class StareRezervata implements Stare{
    @Override
    public void schimbaStare(Masa masa) {
        if (masa.getStare() instanceof StareLibera) {
            masa.setStare(this);
            System.out.println("Masa " + masa.getNumar() + " a fost rezervata.");
        } else {
            System.out.println("Masa nu poate fi rezervata.");
        }
    }
}
