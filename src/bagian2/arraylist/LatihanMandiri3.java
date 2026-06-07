package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>(); 
        String[] data = {"Andi","Budi","Ayu","Citra","Adit","Doni"}; 
        for (String d : data) nama.add(d); 
        for (String n : nama) { 
            if (n.startsWith("A")) System.out.println(n); 
        } 
        // hasil: Andi, Ayu, Adit
            }
        }
