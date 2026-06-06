package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Buat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Buat objek Buku dan masukkan ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 2006));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2007));

        perpus.tampilkanKoleksi();
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");  // coba pinjam kedua kali
        System.out.println();
        
        perpus.kembalikanBuku("Bumi Manusia");
        
        perpus.cariPenulis("Andrea Hirata");

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}
