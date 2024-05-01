//Parent class Hewan
public abstract class Hewan {
    private String nama;

    // Konstruktor untuk membuat objek Hewan dengan nama
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Metode abstract suara yang harus diimplementasikan oleh subclass
    public abstract void bersuara();

    // Metode untuk nama hewan
    public String getNama() {
        return nama;
    }
}