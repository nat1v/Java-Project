package tesdarah;


public class glukosa extends TESdarah {
    int nilai;
    boolean puasa;

    glukosa() {}

    glukosa(String gol, boolean jk, int nilai, boolean puasa) {
        super(gol, jk);
        this.nilai = nilai;
        this.puasa = puasa;
    }

    void setNilai(int nilai) {
        this.nilai = nilai;
    }

    int getNilai() {
        return nilai;
    }

    void setPuasa(boolean puasa) {
        this.puasa = puasa;
    }

    boolean getPuasa() {
        return puasa;
    }

    String kriteria() {
        if (puasa) {
            if (nilai < 110) return "Bukan diabetes";
            else if (nilai <= 125) return "Pra diabetes";
            else return "Diabetes";
        } else {
            if (nilai < 140) return "Bukan diabetes";
            else if (nilai <= 199) return "Pra diabetes";
            else return "Diabetes";
        }
    }
    
    public static void main(String[] args) {
        glukosa g1 = new glukosa("A", true, 90, true);
        System.out.println(g1.getGol());
        System.out.println(g1.getJK() ? "laki-laki":"perempuan");
        System.out.println(g1.getPuasa() ? "Puasa":"Tidak puasa");
        System.out.println(g1.getNilai());
        System.out.println(g1.kriteria());

        glukosa g2 = new glukosa("AB", true, 125, false);
        System.out.println(g2.getGol());
        System.out.println(g2.getJK() ? "laki-laki":"perempuan");
        System.out.println(g2.getPuasa() ? "Puasa":"Tidak puasa");
        System.out.println(g2.getNilai());
        System.out.println(g2.kriteria());
        }
}



