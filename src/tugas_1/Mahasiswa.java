package tugas_1;

public class Mahasiswa {
    private String npm, nama, jurusan;

    public Mahasiswa(String npm, String nama, String jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilkanData() {
        System.out.printf("NPM \t\t : %s%n", npm);
        System.out.printf("Nama \t\t : %s%n", nama);
        System.out.printf("Jurusan \t : %s%n%n", jurusan);
    }

    public String getNpm() {
        return npm;
    }
}