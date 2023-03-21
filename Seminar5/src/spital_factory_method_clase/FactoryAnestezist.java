package spital_factory_method_clase;

public class FactoryAnestezist implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Anestezist(nume);
    }
}
