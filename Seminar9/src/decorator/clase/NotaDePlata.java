package decorator.clase;

public class NotaDePlata implements INotaDePlata {
    private String dataEmiterii;

    public NotaDePlata(String dataEmiterii) {
        this.dataEmiterii = dataEmiterii;
    }

    @Override
    public void printeazaNotaDePlata(double totalPlata) {
        System.out.println("Nota dvs de plata din data de "+dataEmiterii+" este in valoare de "+totalPlata+" lei.");
    }
}
