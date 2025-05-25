/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesdarah;

public class kolesterol extends TESdarah {
    int total, HDL, LDL;
    kolesterol(){};
    
    kolesterol(String gol, boolean jk, int hdl, int ldl){
        golongan = gol;
        JK = jk; 
        HDL = hdl; 
        LDL = ldl;
    }
    void setTotal()
    {
        total = HDL + LDL;
    }
    int getTotal()
    {
        return total;
    }
    void setHDL(int hdl)
    {
        HDL = hdl;
    }
    int getHDL()
    {
        return HDL;
    }
    void setLDL(int ldl)
    {
        LDL = ldl;
    }
    int getLDL(){
        return LDL;}
    
@Override
String kriteria() {
    double total = HDL + LDL;

    String totalStat;
    String hdlStat;
    String ldlStat;

    if (total < 0 || HDL < 0 || LDL < 0) {
        return "Error: Nilai kolesterol tidak boleh negatif.";
    }

    if (total < 200) {
        totalStat = "BAIK";
    } else if (total < 240) {
        totalStat = "PERBATASAN";
    } else {
        totalStat = "BAHAYA";
    }
/*
    if (HDL >= 60) {
        hdlStat = "HDL Normal (>= 60 mg/dL)";
    } else if (HDL >= 40) {
        hdlStat = "HDL Cukup (40 - 59 mg/dL)";
    } else {
        hdlStat = "HDL Rendah (< 40 mg/dL)";
    }

    if (LDL < 100) {
        ldlStat = "LDL Optimal (< 100 mg/dL)";
    } else if (LDL < 130) {
        ldlStat = "LDL Mendekati Optimal (100 - 129 mg/dL)";
    } else if (LDL < 160) {
        ldlStat = "LDL Batas Tinggi (130 - 159 mg/dL)";
    } else if (LDL < 190) {
        ldlStat = "LDL Tinggi (160 - 189 mg/dL)";
    } else {
        ldlStat = "LDL Sangat Tinggi (>= 190 mg/dL)";
    }

    return "Status Kolesterol Total: " + totalStat + " (" + String.format("%.0f", total) + " mg/dL)" +
           "\nStatus HDL: " + hdlStat +
           "\nStatus LDL: " + ldlStat;
*/
    return totalStat;
}

   
    public static void main(String[] args) {
        kolesterol k1 = new kolesterol();

    // Set data menggunakan setter
        k1.golongan = "O";
        k1.JK = true; // true = laki-laki, false = perempuan
        k1.setHDL(55);
        k1.setLDL(120);
        k1.setTotal(); // menghitung total kolesterol

    // Ambil dan tampilkan data menggunakan getter
        System.out.println("Golongan Darah: " + k1.golongan);
        System.out.println("Jenis Kelamin: " + (k1.JK ? "Laki-laki" : "Perempuan"));
        System.out.println("HDL: " + k1.getHDL());
        System.out.println("LDL: " + k1.getLDL());
        System.out.println("Total Kolesterol: " + k1.getTotal());

    // Tampilkan hasil kriteria kolesterol
        System.out.println(k1.kriteria());
        }
    
    
}