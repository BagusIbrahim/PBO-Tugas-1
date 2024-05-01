public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Hewan kucing = new Kucing("Kucing");
        kucing.bersuara(); // Memanggil metode bersuara untuk Kucing

        // Membuat objek Anjing
        Hewan anjing = new Anjing("Anjing");
        anjing.bersuara(); // Memanggil metode bersuara untuk Anjing
    }
}