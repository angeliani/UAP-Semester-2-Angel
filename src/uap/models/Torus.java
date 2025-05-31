package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculable, MassConverter, PiRequired, ShippingCostCalculator {
    private double majorRadius; // jari-jari besar (R)
    private double minorRadius; // jari-jari kecil (r)

    // konstruktor default
    public Torus() {}

    // konstruktor dgn parameter untuk mengisi radius besar dan kecil
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // rumus volume torus
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // rumus luas permukaan (A)
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // rumus massa (gram)
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // konversi gram ke kilogram
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    public double calculateCost() {
        // pembulatan ke atas kalau tidak bulat
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
