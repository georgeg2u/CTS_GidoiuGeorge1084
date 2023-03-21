package spital_factory_method_clase;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
