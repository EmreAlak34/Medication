package org.example;


public class Medication {
    private String name;
    private double price;
    private boolean isAvailable;

    //Konstruktor
    public Medication(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

//Getter fMedication name
    public String getName() {
        return name;
    }

// Getter Medication price
    public double getPrice() {
        return price;
    }

//Getter Medication availability
    public boolean getAvailability() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + isAvailable +
                '}';
    }
}
