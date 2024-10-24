package tugas_3;

import java.text.DecimalFormat;

public class Karyawan {
    private String nomor;
    private String nama;
    private char golongan;
    private float gaji_pokok;

    private float tunjangan_golongan;

    public Karyawan(String nomor, String nama, char golongan, float gaji_pokok) {
        this.nomor = nomor;
        this.nama = nama;
        this.golongan = golongan;
        this.gaji_pokok = gaji_pokok;
    }

    public float totalGaji() {
        /*
         * Tunjangan Golongan:
         * A = Rp 500.000
         * B = Rp 250.000
         * C = Rp 100.000
         */

        switch (this.golongan) {
            case 'A':
                this.tunjangan_golongan = 500_000;
                break;
            case 'B':
                this.tunjangan_golongan = 250_000;
                break;

            default:
                this.tunjangan_golongan = 100_000;
                break;
        }
        return this.gaji_pokok + this.tunjangan_golongan;
    }

    public void detailKaryawan() {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.printf("Nomor \t\t: %s\n", this.nomor);
        System.out.printf("Nama \t\t: %s\n", this.nama);
        System.out.printf("Golongan \t: %s\n", this.golongan);
        System.out.printf("Total Gaji \t: Rp %s\n", df.format(this.totalGaji()));
    }
}
