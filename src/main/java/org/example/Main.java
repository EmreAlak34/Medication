package org.example;



    public static void main(String[] args) {

        Medication med1 = new Medication("Aspirin", 9.99, true);
        Medication med2 = new Medication("Ibuprofen", 12.50, false);
        Medication med3 = new Medication("Paracetamol", 4.50, true);


        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);


        System.out.println("Total medications: " + pharmacy.getCount());


        Medication foundMed = pharmacy.find("Aspirin");
        System.out.println("Found Medication: " + foundMed);


        System.out.println("All medications:");
        pharmacy.printAllMedications();


        pharmacy.delete("Ibuprofen");
        System.out.println("After deletion:");
        pharmacy.printAllMedications();
    }
}
