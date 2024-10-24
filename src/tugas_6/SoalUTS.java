package tugas_6;

class Soal {
    public static int global;
    public int angkaSatu;
    public int angkaDua;

    public Soal() {
    }

    public Soal(int satu) {
        global = satu;
        angkaSatu = satu;
        angkaDua = satu + angkaSatu;
    }
}

public class SoalUTS {
    public static void main(String[] uts) {
        int u, t, s;
        Soal.global = 1;
        Soal satu = new Soal(5);
        satu.angkaDua = 8;
        satu.global = 2;
        Soal dua = new Soal();
        dua.angkaSatu = 20;
        dua.global = 3;
        u = satu.angkaDua * dua.global;
        t = dua.angkaSatu * satu.global;
        s = u % t;

        System.out.println(satu.angkaSatu);
        System.out.println(dua.angkaDua);
        Soal.global = 2;
        int global = satu.global + dua.global;
        System.out.println(global);
        System.out.println(Soal.global);
        System.out.println(u++ + s);
    }
}

/*
 * Terdapat 2 class yaitu Soal dan SoalUTS.
 * Di class sola terdapat property static int global, int angkatSatu dan
 * angkaDua
 * Method consturctor yang men-assign global = argument satu, angkaSatu =
 * argument satu. angkaDua = argument satu + angka satu
 * 
 * Class SoalUST terdapat method main
 * variable u, t, s
 * Property static global = 1
 * Buat objek satu dengan argument 5. Sehingga property static global = 5
 * Assign satu.angkaDua = 8
 * property static global diubah = 2
 * Buat objek dua dengan argumen null. Sehingga semua property di objek dua
 * berisi 0
 * assign dua.angkaSatu = 20
 * Ubah property static global menjadi 3
 * assign u = satu.angkaDua * dua.global (8 * 3) = 24
 * assign t = dua.angkaSatu * satu.global (20 * 3) = 60
 * assign s = u % t (24 % 60) = 24
 * 
 * Print satu.angkaSatu = 5
 * Print dua.angkaDua = 0
 * 
 * Ubah property static global = 2
 * Buat lcoal variable global = satu.global + dua.global (2 + 2) = 4
 * print local vaiable global = 4
 * print property static global = 2
 * print u++ + s (24 + 24) = 48.
 * (u bukan 25 karena dibaca terlebih dahulu baru di increament)
 * 
 * 
 * 
 * 
 */