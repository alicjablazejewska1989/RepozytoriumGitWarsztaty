package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Jan", "Nowak",11));
        patients.add(new Patient("Adam", "Nowak",34));
        patients.add(new Patient("Piotr", "Szulc",43));
        patients.add(new Patient("Michalina","Budzek",21));
        patients.add(new Patient("Michalina","Bodzowska",23));
    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
