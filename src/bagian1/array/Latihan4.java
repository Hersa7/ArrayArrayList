package bagian1.array;

public class Latihan4 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("=== Nama Hari Lebih dari 5 Huruf ===");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h + " (" + h.length() + " huruf)");
            }
        }
    }
}