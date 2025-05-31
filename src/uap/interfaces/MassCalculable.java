package uap.interfaces;

public interface MassCalculable {
    int DENSITY = 8;           // kerapatan SS304 dalam gram/cm³
    double THICKNESS = 0.5;    // ketebalan bahan dalam cm

    double getMass();          // untuk menghitung massa
}
