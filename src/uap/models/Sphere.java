package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ThreeDimensional, MassCalculable, MassConverter, PiRequired, ShippingCostCalculator {
    // radius bola
    private double radius;

    // konstruktor default
    public Sphere() {}

    // konstruktor dengan parameter uuntuk ngisi radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // rumus volume bola
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // rumus luas permukaan bola (A)
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // menghitung massa (gram)
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // konversi gram ke kilogram
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    public double calculateCost() {
        // pembulatan ke atas jika tidak bulat
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    // menampilkan info
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        System.out.println("Biaya kirim     : Rp" + (int) calculateCost());
    }
}
