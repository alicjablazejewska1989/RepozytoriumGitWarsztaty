package pl.michalczukm.isa.java;

// 1. na branchu modify-patient-model -> dodaj nowe pole "age" typu int. I zmodyfikuj konstruktor.
// 2. następnie przejdź na master i zmień nazwę klasy i pliku na PatientModel.
// 3. Zmerguj branch modify-patient-model do mastera

public class PatientModel {
    private final String firstName;
    private final String lastName;
    private int age;

    public PatientModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
