// File: AplikasiPendaftaran.java
package uas1;


public class aplikasi {

    public static void main(String[] args) {
        
        
        System.out.println("### UJIAN AKHIR SEMESTER PBO 2025 ###");
        System.out.println("======================================\n");

        // (Opsional) Menguji constructor dan setter/getter
        System.out.println("--- PENGUJIAN KELAS PENDAFTAR ---");

        // 1. Uji Constructor Kosong dan Setter
        System.out.println("1. Menguji Constructor Kosong dan Setter...");
        Pendaftar p1 = new Pendaftar();
        p1.setNama("Uji Coba");
        p1.setNim("99999");
        p1.setSikap(78);
        p1.setTugas(80);
        p1.setUts(82);
        p1.setUas(79); // Perhitungan rerata dan huruf otomatis terpanggil di sini

        // Uji Getter
        System.out.printf("   Nama: %s, NIM: %s, Rerata: %.2f, Huruf: %s\n",
                p1.getNama(), p1.getNim(), p1.getRerata(), p1.getHuruf());

    
        System.out.println("\n--- Pengujian Selesai ---\n");
        Pendaftar mahasiswa = new Pendaftar("Budi Santoso", "24001", 90, 88, 85, 92); // Seharusnya dapat A
        System.out.printf("   Nama: %s, NIM: %s, Rerata: %.2f, Huruf: %s\n",
                mahasiswa.getNama(), mahasiswa.getNim(), mahasiswa.getRerata(), mahasiswa.getHuruf());

    }

    /**
     * Metode untuk menampilkan daftar Pendaftar dalam format tabel.
     * @param list Daftar objek Pendaftar yang akan ditampilkan.
     */
    
   
}