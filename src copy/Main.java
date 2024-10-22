// Code by Agung Gumelar (202243500145) - hellogung@outlook.com

import java.util.Scanner;

public class Main {
    static boolean isLogin = true;
    static Scanner scanner = new Scanner(System.in);
    static Universitas universitas = new Universitas();

    public static void main(String[] args) {
        // Clear Screen Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        User.initUserDatabase();
        loginMenu();
    }

    static void menu() {
        boolean pilihMenu = true;
        int pilihan;

        System.out.println("Login Berhasil");

        while (pilihMenu) {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Menambah Mahasiswa");
            System.out.println("2. Mencari Mahasiswa");
            System.out.println("3. Menampilkan Mahasiswa");
            System.out.print("Pilih (1/2/3) : ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nINVALID - Input harus berupa angka (1/2/3).");
                continue;
            }

            prosesPilihan(pilihan);

            // Loop untuk memastikan input Y/N valid
            String pilihMenuLagi;
            while (true) {
                System.out.print("\nApakah kamu ingin pilih menu lagi ? (Y/N) : ");
                pilihMenuLagi = scanner.nextLine();

                if (pilihMenuLagi.equalsIgnoreCase("Y")) {
                    pilihMenu = true;
                    break; // Keluar dari loop validasi Y/N
                } else if (pilihMenuLagi.equalsIgnoreCase("N")) {
                    pilihMenu = false;
                    break; // Keluar dari loop validasi Y/N
                } else {
                    System.out.println("Input tidak valid! Harap pilih Y atau N.");
                }
            }

        }
        // Jika user memilih N (mengakhiri program, maka munculkan pesan terima kasih)
        System.out.println("Terima Kasih... Kembali lagi yaa :)");

    }

    static void prosesPilihan(int pilihan) {

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Nama \t : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NPM \t : ");
                String npmA = scanner.nextLine();
                System.out.print("Masukkan Jurusan : ");
                String jurusan = scanner.nextLine();
                universitas.tambahMahasiswa(new Mahasiswa(npmA, nama, jurusan));
                break;

            case 2:
                System.out.println("Cari Mahasiswa");

                System.out.print("Masukkan NPM Mahasiswa \t : ");

                String npmB = scanner.nextLine();
                Mahasiswa mahasiswa = universitas.cariMahasiswa(npmB);
                if (mahasiswa != null) {
                    mahasiswa.tampilkanData();
                }
                break;
            case 3:
                universitas.tampilkanSemuaMahasiswa();
                break;
        }
    }

    static void loginMenu() {

        System.out.println("Selamat di Sistem Manajemen Mahasiswa");
        System.out.println("Silahkan masukkan username dan password\n");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean isLogin = User.login(username, password);

        if (isLogin) {
            menu();
        } else {
            System.out.println("Login gagal!");
        }
    }
}