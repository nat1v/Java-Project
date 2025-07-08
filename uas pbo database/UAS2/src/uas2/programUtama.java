// TestRestaurantConsole.java
package uas2;

import java.text.NumberFormat;
import java.util.Locale;

public class programUtama {

    public static void main(String[] args) {
        // Helper untuk memformat angka menjadi format mata uang Rupiah
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("======================================================");
        System.out.println("### PENGUJIAN KELAS RESTAURANT DI CONSOLE (CMD) ###");
        System.out.println("======================================================");

        // 1. Uji Constructor Kosong dan Metode Setter/Getter
        System.out.println("\n--- 1. UJI CONSTRUCTOR KOSONG & SETTER ---");
        Restaurant resto1 = new Restaurant(); // Memanggil constructor kosong
        System.out.println("=> Objek 'resto1' berhasil dibuat menggunakan constructor kosong.");

        // Mengisi data objek menggunakan metode setter
        System.out.println("\n=> Mengisi data 'resto1' menggunakan metode SETTER...");
        resto1.setNama("Sate Padang Makmur");
        resto1.setBulan("Juli 2025");
        resto1.setPendBruto(75000000);
        resto1.setPengListAir(4500000);
        resto1.setPengBahan(22000000);
        System.out.println("   Data berhasil diisi.");
        // Perhitungan otomatis terjadi di dalam setter

        System.out.println("\n=> Menampilkan data 'resto1' menggunakan metode GETTER:");
        printRestaurantDetails(resto1, currencyFormat);


        // 2. Uji Constructor dengan Parameter dan Metode Getter
        System.out.println("\n\n--- 2. UJI CONSTRUCTOR DENGAN PARAMETER ---");
        // Membuat objek dengan data awal langsung dari constructor
        Restaurant resto2 = new Restaurant("Bebek Goreng Sejahtera", "Agustus 2025", 90000000, 8000000, 35000000);
        System.out.println("=> Objek 'resto2' berhasil dibuat menggunakan constructor berparameter.");

        System.out.println("\n=> Menampilkan data 'resto2' menggunakan metode GETTER:");
        printRestaurantDetails(resto2, currencyFormat);


        // 3. Uji Ulang Setter untuk Memastikan Perhitungan Ulang
        System.out.println("\n\n--- 3. UJI ULANG FUNGSI SETTER PADA OBJEK 'resto2' ---");
        System.out.println("=> Mengubah Pendapatan Bruto 'resto2' dari Rp 90jt menjadi Rp 100jt...");
        resto2.setPendBruto(100000000); // Mengubah salah satu nilai

        System.out.println("\n=> Menampilkan data 'resto2' SETELAH DIUBAH (Uji Getter Ulang):");
        System.out.println("   Perhatikan bagaimana Pendapatan Netto dan distribusinya ikut berubah.");
        printRestaurantDetails(resto2, currencyFormat);


        System.out.println("\n======================================================");
        System.out.println("### PENGUJIAN SELESAI ###");
        System.out.println("======================================================");
    }

    /**
     * Metode bantuan untuk mencetak detail objek Restaurant dengan format.
     * @param resto Objek restaurant yang akan dicetak
     * @param formatter Formatter untuk mata uang
     */
    public static void printRestaurantDetails(Restaurant resto, NumberFormat formatter) {
        System.out.println("-------------------------------------------------");
        System.out.println(" Nama Restoran      : " + resto.getNama());
        System.out.println(" Bulan Laporan      : " + resto.getBulan());
        System.out.println(" Pendapatan Bruto   : " + formatter.format(resto.getPendBruto()));
        System.out.println(" Peng. Listrik/Air  : " + formatter.format(resto.getPengListAir()));
        System.out.println(" Peng. Bahan Baku   : " + formatter.format(resto.getPengBahan()));
        System.out.println("-------------------------------------------------");
        System.out.println(" Pendapatan Netto   : " + formatter.format(resto.getPendNet()));
        System.out.println(" Bagian Manajer (30%): " + formatter.format(resto.getManager()));
        System.out.println(" Sewa (30%)         : " + formatter.format(resto.getSewa()));
        System.out.println(" Bagian Pemilik (30%): " + formatter.format(resto.getOwner()));
        System.out.println(" CSR (10%)          : " + formatter.format(resto.getCsr()));
        System.out.println("-------------------------------------------------");
    }
}