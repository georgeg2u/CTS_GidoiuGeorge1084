package spital_factory_method_clase;

public class FactoryInfirmier implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Infirmier(nume);
    }
}
