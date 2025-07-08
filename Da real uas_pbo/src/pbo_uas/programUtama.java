/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uas;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author 0xr00t
 */
public class programUtama{
   public static void main(String[] args) {
       
        petani petaniA = new petani("Budi", 1, 1000000, 500000, 1000000, 2000000);

        // format rupiah
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

      
        System.out.println("Data hasil petani");
        System.out.println("Nama Petani\t\t: " + petaniA.getNama());
        System.out.println("Panen ke-\t\t: " + petaniA.getPanen_ke());
       
        System.out.println("Pendapatan Bruto\t: " + formatter.format(petaniA.getPend_bruto()));
        System.out.println("Biaya Sewa Lahan\t: " + formatter.format(petaniA.getSewa()));
        System.out.println("Pendapatan Net (Setelah Sewa)\t: " + formatter.format(petaniA.getPend_net()));
        
        System.out.println("\nbagi profitttt");
        System.out.println("Bagian Bruto Pemilik (50%)\t: " + formatter.format(petaniA.getOwner_bruto()));
        System.out.println("Biaya Pupuk & Pestisida\t: " + formatter.format(petaniA.getBiaya_pupukpestisida()));
        System.out.println("Pendapatan Bersih Pemilik\t: " + formatter.format(petaniA.getOwner_net()));
   
        System.out.println("Bagian Bruto Penggarap (50%)\t: " + formatter.format(petaniA.getPenyakap_bruto()));
        System.out.println("Biaya Tenaga Kerja\t: " + formatter.format(petaniA.getTenagakerja()));
        System.out.println("Pendapatan Bersih Penggarap\t: " + formatter.format(petaniA.getPenyakap_net()));
        
        System.out.println("\n==================================================");
        System.out.println("Contoh penggunaan setter:");
        // Misalkan ada perubahan biaya tenaga kerja
        petaniA.setTenagakerja(1200000);
        System.out.println("Biaya Tenaga Kerja diubah menjadi: " + formatter.format(petaniA.getTenagakerja()));
        System.out.println("Pendapatan Bersih Penggarap (setelah perubahan)\t: " + formatter.format(petaniA.getPenyakap_net()));
        
        petani petaniB = new petani();
        petaniB.setNama("Yana");
        petaniB.setPanen_ke(2);
        petaniB.setPend_bruto(25000000);
        petaniB.setBiaya_pupukpestisida(1200000);
        petaniB.setSewa(4000000);
        petaniB.setTenagakerja(2000000); // Perhitungan otomatis terjadi di sini
    
        System.out.println("\npetani b");
        System.out.println("Nama Petani\t\t\t: " + petaniB.getNama());
        System.out.println("Panen ke-\t\t\t: " + petaniB.getPanen_ke());
        System.out.println("----------------------------------------------------------");
        System.out.println("Pendapatan Bruto\t\t: " + formatter.format(petaniB.getPend_bruto()));
        System.out.println("Biaya Sewa Lahan\t\t: " + formatter.format(petaniB.getSewa()));
        System.out.println("Pendapatan Net (Setelah Sewa)\t: " + formatter.format(petaniB.getPend_net()));
        System.out.println("----------------------------------------------------------");
        System.out.println("\nsaatnya bagi profitt");
    // Bagian Pemilik
        System.out.println("\nprofit pemilik");
        System.out.println("Bagian Bruto (50%)\t\t: " + formatter.format(petaniB.getOwner_bruto()));
        System.out.println("Biaya Pupuk & Pestisida\t\t: " + formatter.format(petaniB.getBiaya_pupukpestisida()));
        System.out.println("Pendapatan Bersih Pemilik\t: " + formatter.format(petaniB.getOwner_net()));
    // Bagian Penggarap
        System.out.println("\nperfit pengajag");
        System.out.println("Bagian Bruto (50%)\t\t: " + formatter.format(petaniB.getPenyakap_bruto()));
        System.out.println("Biaya Tenaga Kerja\t\t: " + formatter.format(petaniB.getTenagakerja()));
        System.out.println("Pendapatan Bersih Penggarap\t: " + formatter.format(petaniB.getPenyakap_net()));
   }
}
