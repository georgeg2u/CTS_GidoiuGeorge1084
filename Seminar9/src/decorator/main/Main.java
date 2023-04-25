package decorator.main;

import decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata1=new NotaDePlata("25.04.2023");
        notaDePlata1.printeazaNotaDePlata(250);

//        Decorator notaPlataLMA=new DecoratorNotaPlataLMA(notaDePlata1);
//        notaPlataLMA.printeazaNotaDePlata(493);
//        notaPlataLMA.printareFelicitare();
//        DecoratorNotaPlataPasteFericit notaPlataPasteFericit=new DecoratorNotaPlataPasteFericit(notaDePlata1);
//        notaPlataPasteFericit.printeazaNotaDePlata(300);
//        notaPlataPasteFericit.printareFelicitare();

        DecoratorNotaPlataPasteFericit notaPlataPasteFericit=new DecoratorNotaPlataPasteFericit(notaDePlata1);
        notaPlataPasteFericit.printeazaNotaDePlata(300);
        notaPlataPasteFericit.printareFelicitare();

        Decorator notaPlataLMA=new DecoratorNotaPlataLMA(notaPlataPasteFericit);
        notaPlataLMA.printeazaNotaDePlata(493);
    }
}
