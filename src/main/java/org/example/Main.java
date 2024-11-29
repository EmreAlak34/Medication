package org.example;

public class Main {  // The Main class should be declared here

    public static void main(String[] args) {
        // Create Medications
        Medication med1 = new Medication("Aspirin", 9.99, true);
        Medication med2 = new Medication("Ibuprofen", 12.50, false);
        Medication med3 = new Medication("Paracetamol", 4.50, true);

        // Create Pharmacy and add medications
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);

        // Print total medications count
        System.out.println("Total medications: " + pharmacy.getCount());

        // Find a specific medication
        Medication foundMed = pharmacy.find("Aspirin");
        System.out.println("Found Medication: " + foundMed);

        // Print all medications
        System.out.println("All medications:");
        pharmacy.printAllMedications();

        // Delete a medication
        pharmacy.delete("Ibuprofen");
        System.out.println("After deletion:");
        pharmacy.printAllMedications();
    }
}
