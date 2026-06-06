package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Nasi");
        belanja.add("Ayam");
        belanja.add("Sayur");
        belanja.add("Telur");
        
        System.out.println("Sebelum hapus: " + belanja);
        belanja.remove(1);   
        System.out.println("Setelah hapus: " + belanja);
        System.out.println("Jumlah akhir : " + belanja.size());   
    }
}