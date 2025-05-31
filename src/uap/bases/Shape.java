package uap.bases;

// abstract class sebagai parent untuk Torus dan Sphere
public abstract class Shape {
    private String name;

    // konstruktor default
    public Shape() {
        // inisialisasi nama dengan nilai default
        this.name = "Unknown Shape";
    }

    // mengatur nama bentuk
    public void setName(String inputName) {
        this.name = inputName; 
    }

    // dapetin nama bentuk
    public String getName() {
        return this.name;
    }

    public abstract void printInfo(); // diimplementasi anak class
}
