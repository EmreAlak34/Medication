package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;


    public Pharmacy() {
        medications = new HashMap<>();
    }


    public int getCount() {
        return medications.size();
    }

    // Method to save a medication
    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    // Method to find a medication by its name
    public Medication find(String medicationName) {
        return medications.get(medicationName);
    }

    // Method to delete a medication by its name
    public void delete(String medicationName) {
        medications.remove(medicationName);
    }


    public void printAllMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }
    }
}
