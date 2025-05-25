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
        String hasilTensi = "";
      
        if (sistol <= 0 || diastol <= 0 || sistol < 30 || diastol < 30 || diastol >= sistol + 10) {
        
            hasilTensi = "Data tidak valid";
            return hasilTensi;
        }

        // mulai dari pling parah
        if (sistol >= 160 || diastol >= 100) {
            hasilTensi = "Hipertensi tahap 2";
        }
        // thp 1
        else if ((sistol >= 140 && sistol <= 159) || (diastol >= 90 && diastol <= 99)) {
        
            hasilTensi = "Hipertensi tahap 1";
        }
        // pra hiper;
        else if ((sistol > 120 && sistol <= 139) || (diastol > 80 && diastol <= 89)) {
            hasilTensi = "Pra-hipertensi";
        }
        // nrml
        else if (sistol >= 90 && sistol <= 120 && diastol >= 60 && diastol <= 80) {
            hasilTensi = "Tekanan darah normal";
        }
        // low
        else if (sistol < 90 || diastol < 60) {
            hasilTensi = "Tekanan darah rendah";
        }
        //  abnormal
        else {
            hasilTensi = "Kategori tidak diketahui";
        }

       
        
        /*  
        if (sistol < 90 || diastol < 60) {
            hasilTensi = "Tekanan darah rendah";
        } else if (sistol >= 90 && sistol <= 120 && diastol >= 60 && diastol <= 80) {
            hasilTensi = "Tekanan darah normal";
        } else if ((sistol > 120 && sistol <= 139) || (diastol > 80 && diastol <= 89)) {
            hasilTensi = "Pra-hipertensi";
        } else if ((sistol >= 140 && sistol <= 159) || (diastol >= 90 && diastol <= 99)) {
            hasilTensi = "Hipertensi tahap 1";
        } else if (sistol >= 160 || diastol >= 100) {
            hasilTensi = "Hipertensi tahap 2";
        } else {
            hasilTensi = "Kategori tidak diketahui";
        }
*/
        return hasilTensi;
    }

    public static void main(String[] args) {
        tensi t1 = new tensi(130, 85);
        System.out.println(t1.kriteria()); //prahiper
    }
}