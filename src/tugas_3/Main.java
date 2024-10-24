package tugas_3;

public class Main {
    public static void main(String[] args) {
        // Clear Screen Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Karyawan agung = new Karyawan("K001", "Agung Gumelar", 'A', 5400000);
        agung.detailKaryawan();
    }
}
