package spital_factory_method_clase;


public class FactoryMedic implements  Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
