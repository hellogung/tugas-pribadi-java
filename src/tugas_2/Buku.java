package tugas_2;

public class Buku {
    public String kode;
    public String judul;
    public String nama_penerbit;
    public String nama_penulis;
    private int jumlah;
    protected String nomor_rak;

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}