package tugas_2;

// Tugas Sistem Perpustakaan
public class Main {
    public static void main(String[] args) {
        // Clear Screen Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Buku buku = new Buku();

        buku.judul = "Harry Potter";
        buku.kode = "HP";
        buku.nama_penerbit = "Bloomsbury";
        buku.nama_penulis = "J. K. Rowling";
        buku.setJumlah(200);
        buku.nomor_rak = "H1";

        System.out.printf("Buku \t\t: %s \n", buku.judul);
        System.out.printf("Kode Buku \t: %s \n", buku.kode);
        System.out.printf("Nama Penerbit \t: %s \n", buku.nama_penerbit);
        System.out.printf("Nama Penulis \t: %s \n", buku.nama_penulis);
        System.out.printf("Jumlah Buku \t: %s \n", buku.getJumlah());
        System.out.printf("Nomor Rak \t: %s \n", buku.nomor_rak);
    }
}