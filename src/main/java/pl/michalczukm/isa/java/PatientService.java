package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Jan", "Nowak"));
        patients.add(new Patient("Adam", "Nowak"));
        patients.add(new Patient("Piotr", "Szulc"));
        patients.add(new Patient("Michalina","Budzek"));
        patients.add(new Patient("Michalina","Bodzowska"));
    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
