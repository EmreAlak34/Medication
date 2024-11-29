package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;

//Konstruktor, um pharmacy zu initialisieren
    public Pharmacy() {
        medications = new HashMap<>();
    }

//Medications-Menge
    public int getCount() {
        return medications.size();
    }

//save Medication Methode
    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

//Medication nach Namen finden
    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

//Delete Medication by Name
    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

//Print all Medication
    public void printAllMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }
    }
}
