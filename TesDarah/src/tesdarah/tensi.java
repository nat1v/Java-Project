package tesdarah;

public class tensi extends TESdarah {
    int sistol;
    int diastol;

    // Setter
    void setSistol(int s) {
        sistol = s;
    }

    void setDiastol(int d) {
        diastol = d;
    }

    // Getter
    int getSistol() {
        return sistol;
    }

    int getDiastol() {
        return diastol;
    }

    // Constructor tanpa parameter
    tensi() {
    }

    // Constructor dengan parameter
    tensi(int s, int d) {
        sistol = s;
        diastol = d;
    }

    // Menentukan kriteria tekanan darah
    String kriteria() {
        if (sistol < 90 || diastol < 60) {
            System.out.println("Tekanan darah rendah");
        } else if (sistol >= 90 && sistol <= 120 && diastol >= 60 && diastol <= 80) {
            System.out.println("Tekanan darah normal");
        } else if ((sistol > 120 && sistol <= 139) || (diastol > 80 && diastol <= 89)) {
            System.out.println("Pra-hipertensi");
        } else if ((sistol >= 140 && sistol <= 159) || (diastol >= 90 && diastol <= 99)) {
            System.out.println("Hipertensi tahap 1");
        } else if (sistol >= 160 || diastol >= 100) {
            System.out.println("Hipertensi tahap 2");
        } else {
            System.out.println("Kategori tidak diketahui");
        }

        return "Penilaian selesai";
    }

    public static void main(String[] args) {
        tensi t1 = new tensi(130, 85);
        t1.kriteria();  // Output: Pra-hipertensi
    }
}