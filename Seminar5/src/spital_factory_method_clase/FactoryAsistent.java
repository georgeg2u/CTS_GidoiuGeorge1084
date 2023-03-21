package spital_factory_method_clase;

public class FactoryAsistent implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}
