package tugas_1;
import java.util.ArrayList;
import java.util.List;

public class Universitas {
    List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void tampilkanSemuaMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang terdaftar");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa m : mahasiswaList) {
                m.tampilkanData();
            }
        }
    }

    public Mahasiswa cariMahasiswa(String npm) {
        for (Mahasiswa m : mahasiswaList) {
            if (m.getNpm().equals(npm)) {
                return m;
            }
        }
        System.out.println("Mahasiswa yang anda cari tidak ditemukan :(");
        return null;
    }
}
