// ============================================
// Nama : Muhammad Hersa Sugiannor
// NPM  : 2410010253
// ============================================
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Basis Data",
            "Algoritma dan Pemrograman"
        };

        System.out.println("===== Mata Kuliah yang Dikelola =====");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Andi",   "2410010001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi",   "2410010002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra",  "2410010003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dani",   "2410010004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eva",    "2410010005", 78.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("Rata-rata nilai  : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus() + " mahasiswa");
        System.out.println();

        System.out.println(">> Menambahkan mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2410010006", 70.0));

        kelas.tampilkanSemua();
        System.out.println();
        System.out.println("Rata-rata nilai  : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus() + " mahasiswa");
    }
}
