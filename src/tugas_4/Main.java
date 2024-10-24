package tugas_4;

public class Main {
    public static void main(String[] args) {
        // Clear Screen Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Mahasiswa agung = new Mahasiswa("202243500145", "Agung Gumelar", 50, 80);
        agung.detailMahasiswa();
    }
}