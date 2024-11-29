package org.example;

public class Main {

    public static void main(String[] args) {
        // Medikamente erstllen
        Medication med1 = new Medication("Aspirin", 9.99, true);
        Medication med2 = new Medication("Ibuprofen", 12.50, false);
        Medication med3 = new Medication("Paracetamol", 4.50, true);

        // Pharmacy erstellen und Medikamente hinzufügen
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);

        // Komplette Menge ausgeben
        System.out.println("Total medications: " + pharmacy.getCount());

        // Ein bestimmtes Medikament finden
        Medication foundMed = pharmacy.find("Aspirin");
        System.out.println("Found Medication: " + foundMed);

        // Alle Medications ausgeben
        System.out.println("All medications:");
        pharmacy.printAllMedications();

        // Ein Medikament löschen
        pharmacy.delete("Ibuprofen");
        System.out.println("After deletion:");
        pharmacy.printAllMedications();
    }
}
