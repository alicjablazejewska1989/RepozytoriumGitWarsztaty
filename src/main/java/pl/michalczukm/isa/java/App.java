package pl.michalczukm.isa.java;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        for (Patient patient : patients) {
            System.out.println(String.format("%1$s", patient.getFirstName()));
            System.out.println(String.format("%1$s", patient.getLastName()));
        }
    }
    ////jhkiyghu
}
