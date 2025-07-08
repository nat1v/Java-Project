package uas1;

public class Pendaftar {

    // Atribut-atribut kelas Pendaftar
    private String nama;
    private String nim;
    private float sikap;
    private float tugas;
    private float uts;
    private float uas;
    private float rerata;
    private String huruf;

    /**
     * Constructor kosong (no-argument constructor).
     * Menginisialisasi objek tanpa nilai awal.
     */
    public Pendaftar() {
    }

  
    public Pendaftar(String nama, String nim, float sikap, float tugas, float uts, float uas) {
        this.nama = nama;
        this.nim = nim;
        this.sikap = (float) sikap;
        this.tugas = (float) tugas;
        this.uts = (float) uts;
        this.uas = (float) uas;
        // Langsung hitung rerata dan huruf saat objek dibuat
        this.setRerata();
        this.setHuruf();
    }

    // === METODE SETTER ===

    /**
     * Setter untuk nama.
     * @param nama Nama baru pendaftar.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Setter untuk NIM.
     * @param nim NIM baru pendaftar.
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * Setter untuk nilai sikap.
     * Setelah nilai diubah, metode ini akan memicu perhitungan ulang rerata dan huruf.
     * @param sikap Nilai sikap baru (0-100).
     */
    public void setSikap(float sikap) {
        this.sikap = (float) sikap;
        this.setRerata();
        this.setHuruf();
    }

    /**
     * Setter untuk nilai tugas.
     * Setelah nilai diubah, metode ini akan memicu perhitungan ulang rerata dan huruf.
     * @param tugas Nilai tugas baru (0-100).
     */
    public void setTugas(float tugas) {
        this.tugas = (float) tugas;
        this.setRerata();
        this.setHuruf();
    }

    /**
     * Setter untuk nilai UTS.
     * Setelah nilai diubah, metode ini akan memicu perhitungan ulang rerata dan huruf.
     * @param uts Nilai UTS baru (0-100).
     */
    public void setUts(float uts) {
        this.uts = (float) uts;
        this.setRerata();
        this.setHuruf();
    }

    /**
     * Setter untuk nilai UAS.
     * Setelah nilai diubah, metode ini akan memicu perhitungan ulang rerata dan huruf.
     * @param uas Nilai UAS baru (0-100).
     */
    public void setUas(float uas) {
        this.uas = (float) uas;
        this.setRerata();
        this.setHuruf();
    }

    /**
     * Setter untuk Rerata (metode kalkulasi).
     * Menghitung nilai rerata berdasarkan bobot yang ditentukan:
     * Rerata = 0.2*sikap + 0.4*tugas + 0.15*uts + 0.25*uas
     */
    public void setRerata() {
        this.rerata = (float) ((0.2 * this.sikap) + (0.4 * this.tugas) + (0.15 * this.uts) + (0.25 * this.uas));
    }

    /**
     * Setter untuk Huruf (metode kalkulasi).
     * Menentukan nilai huruf berdasarkan nilai rerata yang sudah dihitung.
     */
    public void setHuruf() {
        if (this.rerata > 84.5 && this.rerata <= 100) {
            this.huruf = "A";
        } else if (this.rerata > 80.5) {
            this.huruf = "A-";
        } else if (this.rerata > 76.5) {
            this.huruf = "B+";
        } else if (this.rerata > 72.5) {
            this.huruf = "B";
        } else if (this.rerata > 68.5) {
            this.huruf = "B-";
        } else if (this.rerata > 64.5) {
            this.huruf = "C+";
        } else if (this.rerata > 60.5) {
            this.huruf = "C";
        } else if (this.rerata > 49.5) {
            this.huruf = "D";
        } else {
            this.huruf = "E";
        }
    }

    // === METODE GETTER ===

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public float getSikap() {
        return sikap;
    }

    public float getTugas() {
        return tugas;
    }

    public float getUts() {
        return uts;
    }

    public float getUas() {
        return uas;
    }

    public float getRerata() {
        return rerata;
    }

    public String getHuruf() {
        return huruf;
    }
}