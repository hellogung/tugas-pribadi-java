package tugas_5;

public class UTS {
    public static int nilai;
    public static int review;
    public double tugas;

    public static void main(String[] ar) {
        UTS.nilai = 5;

        UTS bagus = new UTS();
        bagus.tugas = 50;
        bagus.nilai = 8;
        bagus.review = 4;

        UTS wow = new UTS();
        wow.tugas = 6;
        wow.nilai = 7;
        wow.review = 10;

        int jumlah = UTS.nilai + bagus.nilai + wow.nilai + wow.review;
        Double total = bagus.tugas + bagus.nilai + wow.review;

        System.out.println(UTS.nilai);
        System.out.println(wow.review);
        System.out.println(jumlah);
        System.out.println(total);

        /*
         * 1. Variabel public static yaitu nilai dan review yang bertipe integer
         * 2. Variable public tugas yang bertipe double
         * 3. Ketika pertama kali dijalankan nilai diassign menjadi 5
         * 4. Instansiasi Class UTS dengan nama objek bagus. Merubah variable tugas menjadi 50, nilai menjadi 8, dan review menjadi 4.
         * 5. Instansiasi Class UTS dengan nama objek wow. Merubah juga variable tguas menjadi 6, nilai menjadi 7, dan review menjadi 10.
         * 6. Variable jumlah (int) dengan UTS.nilai + bagus.nilai + wow.nilai + wow.review;
         * 7. Karena static, maka property nilai dan review akan berubah.
         * 8. Jumlah = 7 + 7 + 7 + 10. Semuanya nilai menjadi 7 karena di wow.nilai mengubah property nilai menjadi 7.
         * 9. variable total = 50 + 7 +10
         * 10. Print
         */
    }

}