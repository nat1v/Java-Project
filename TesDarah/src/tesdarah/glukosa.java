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
        String hasilGlukosa = "";
        if (puasa) {
            
            if (nilai < 110){
                hasilGlukosa = "Bukan Diabetes";
            }
            else if (nilai <= 125){
                hasilGlukosa = "Pra diabetes";
            }
            else hasilGlukosa = "Diabetes";
        
        } else {
            
            if (nilai < 140){ 
                hasilGlukosa = "Bukan diabetes";
            }
            else if (nilai <= 199){
                hasilGlukosa =  "Pra diabetes";
            }
            else hasilGlukosa = "Diabetes";
        }
        return hasilGlukosa;
    }
    
    public static void main(String[] args) {
        glukosa g1 = new glukosa("A", true, 90, true);
        System.out.println(g1.getGol());
        System.out.println(g1.getJK() ? "laki-laki":"perempuan");
        System.out.println(g1.getPuasa() ? "Puasa":"Tidak puasa");
        System.out.println(g1.getNilai());
        System.out.println(g1.kriteria());

        }
}



