package tesdarah;

public class ResikoJantung extends TESdarah {
    // Atribut
    int HDL, LDL, Total;

    // Konstruktor default
    ResikoJantung() {}

    // Konstruktor dengan parameter tanpa menggunakan this
    ResikoJantung(String s, boolean b, int hdl, int ldl) {
        super(s, b);
        HDL = hdl;
        LDL = ldl;
        Total = HDL + LDL;
    }

    // Metode setter dan getter
    void setHDL(int i) {
        HDL = i;
    }

    int getHDL() {
        return HDL;
    }

    void setLDL(int i) {
        LDL = i;
    }

    int getLDL() {
        return LDL;
    }

    void setTotal() {
        Total = HDL + LDL;
    }

    int getTotal() {
        return Total;
    }

    @Override
    String kriteria() {
        String hasil = "";

        double rasioTotalHDL = (double) Total / HDL;
        double rasioLDLHDL = (double) LDL / HDL;

        if (rasioTotalHDL < 3.5) {
            hasil += "Total/HDL     : Ideal\n";
        } else if (rasioTotalHDL > 5) {
            hasil += "Total/HDL     : Buruk\n";
        } else {
            hasil += "Total/HDL     : Baik\n";
        }

        if (rasioLDLHDL < 2) {
            hasil += "LDL/HDL       : Ideal\n";
        } else if (rasioLDLHDL > 5) {
            hasil += "LDL/HDL       : Buruk\n";
        } else {
            hasil += "LDL/HDL       : Baik\n";
        }

        return hasil;
    }

    // Static main untuk uji coba
    public static void main(String[] args) {
        ResikoJantung pasien = new ResikoJantung("AB", true, 50, 100);

        System.out.println("Data Pasien:");
        System.out.println("Golongan Darah: " + pasien.getGol());
        System.out.println("Jenis Kelamin : " + (pasien.getJK() ? "Pria" : "Wanita"));
        System.out.println("HDL           : " + pasien.getHDL());
        System.out.println("LDL           : " + pasien.getLDL());
        pasien.setTotal(); // hitung total
        System.out.println("Total Kolesterol: " + pasien.getTotal());

        // Tampilkan hasil analisis
        System.out.println("\nAnalisis Risiko Jantung:");
        System.out.print(pasien.kriteria());
    }
}