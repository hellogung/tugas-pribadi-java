# Tugas 5

## Output

```bash
7
10
31
67.0
```

## Penjelasan

*1. UTS.nilai = 5;* Pada awalnya, variabel nilai pada kelas UTS diinisialisasi dengan nilai 5. Tapi karena nilai adalah static, artinya shared oleh semua objek dari kelas UTS.

*2. Objek bagus dibuat dan diubah:*
- bagus.tugas = 50; -> objek bagus memiliki properti tugas dengan nilai 50.
- bagus.nilai = 8; -> karena nilai bersifat static, nilai UTS.nilai berubah dari 5 menjadi 8 untuk semua instance.
- bagus.review = 4; -> review juga static, jadi nilai review sekarang 4 untuk semua instance.

*3. Objek wow dibuat dan diubah:*
- wow.tugas = 6; -> objek wow memiliki properti tugas dengan nilai 6.
- wow.nilai = 7; -> karena nilai adalah static, nilainya diubah lagi menjadi 7 (meng-overwrite nilai 8 sebelumnya).
- wow.review = 10; -> karena review juga static, nilainya berubah menjadi 10.

*4. Perhitungan jumlah:*
- UTS.nilai = 7 (karena nilai static dan terakhir diubah oleh wow).
- bagus.nilai = 7 (karena nilai static, jadi semua instance punya nilai yang sama).
- wow.nilai = 7.
- wow.review = 10.
- jumlah = 7 + 7 + 7 + 10 = 28.

*5. Perhitungan total:*
- bagus.tugas = 50.
- bagus.nilai = 7 (lagi-lagi karena nilai adalah static).
- wow.review = 10.
- total = 50 + 7 + 10 = 64.0.

## Code

```java
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
    }

}
```