package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanSemua() {
        System.out.println("===== Daftar Mahasiswa =====");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + m.info());
        }
        System.out.println("Total: " + daftarMahasiswa.size() + " mahasiswa");
    }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();  
        }
        return total / daftarMahasiswa.size();  
    }

    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) { 
                hitung++;
            }
        }
        return hitung;
    }
}


