package tugas_4;

public class Mahasiswa {
    private String npm;
    private String nama;
    private float nilai;
    private float tugas;

    public Mahasiswa(String npm, String nama, float nilai, float tugas) {
        this.npm = npm;
        this.nama = nama;
        this.nilai = nilai;
        this.tugas = tugas;
    }

    public float totalNilai() {
        return (this.nilai + this.tugas) / 2;
    }

    public void detailMahasiswa() {
        char ipk = ' ';
        /*
         * IPK berdasarkan total nilai
         * A = 85-100
         * B = 60-84
         * C = <84
         */

        if (totalNilai() >= 85 && totalNilai() <= 100) {
            ipk = 'A';
        } else if (totalNilai() >= 60 && totalNilai() <= 84) {
            ipk = 'B';
        } else if (totalNilai() < 84) {
            ipk = 'C';
        } else {
            System.out.println("Invalid");
        }

        System.out.printf("NPM \t: %s\n", this.npm);
        System.out.printf("Nama \t: %s\n", this.nama);
        System.out.printf("Nilai \t: %s\n", this.nilai);
        System.out.printf("Tugas \t: %s\n", this.tugas);
        System.out.printf("IPK \t: %s\n", ipk);
    }
}