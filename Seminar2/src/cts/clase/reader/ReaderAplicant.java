package cts.clase.reader;

import cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {

    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
