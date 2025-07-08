/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas2;
public class Restaurant {
    // Atribut
    private String nama;
    private String bulan;
    private double pend_bruto;
    private double peng_list_air;
    private double peng_bahan;
    private double pend_net;
    private double manager;
    private double sewa;
    private double owner;
    private double csr;
    
    // 1. Constructor Kosong
    public Restaurant() {
        // Constructor tanpa parameter, nilai default (0 atau null) akan digunakan.
    }
    
    // 2. Constructor dengan Parameter (untuk input utama)
    public Restaurant(String nama, String bulan, double pend_bruto, double peng_list_air, double peng_bahan) {
        this.nama = nama;
        this.bulan = bulan;
        this.pend_bruto = pend_bruto;
        this.peng_list_air = peng_list_air;
        this.peng_bahan = peng_bahan;
        hitungPendapatanNet();
        hitungManager();
        hitungSewa();
        hitungOwner();
        hitungCsr();
    }
    
    // Metode untuk menghitung pendapatan net
    private void hitungPendapatanNet() {
        this.pend_net = this.pend_bruto - this.peng_list_air - this.peng_bahan;
        // Pastikan pend_net tidak negatif
        if (this.pend_net < 0) {
            this.pend_net = 0;
        }
    }
    
    // Metode untuk menghitung bagian manager
    private void hitungManager() {
        this.manager = 0.30 * this.pend_net; // 30%
    }
    
    // Metode untuk menghitung bagian sewa
    private void hitungSewa() {
        this.sewa = 0.30 * this.pend_net; // 30%
    }
    
    // Metode untuk menghitung bagian owner
    private void hitungOwner() {
        this.owner = 0.30 * this.pend_net; // 30%
    }
    
    // Metode untuk menghitung bagian CSR
    private void hitungCsr() {
        this.csr = 0.10 * this.pend_net; // 10%
    }
    
    // 3. Metode Getter (untuk semua atribut)
    public String getNama() {
        return nama;
    }
    
    public String getBulan() {
        return bulan;
    }
    
    public double getPendBruto() {
        return pend_bruto;
    }
    
    public double getPengListAir() {
        return peng_list_air;
    }
    
    public double getPengBahan() {
        return peng_bahan;
    }
    
    public double getPendNet() {
        return pend_net;
    }
    
    public double getManager() {
        return manager;
    }
    
    public double getSewa() {
        return sewa;
    }
    
    public double getOwner() {
        return owner;
    }
    
    public double getCsr() {
        return csr;
    }
    
    // 4. Metode Setter (hanya untuk atribut input)
    // Setiap kali nilai input diubah, nilai turunan akan dihitung ulang.
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setBulan(String bulan) {
        this.bulan = bulan;
    }
    
    public void setPendBruto(double pend_bruto) {
        this.pend_bruto = pend_bruto;
        hitungPendapatanNet(); // Hitung ulang pend_net
        hitungManager(); // Hitung ulang manager
        hitungSewa(); // Hitung ulang sewa
        hitungOwner(); // Hitung ulang owner
        hitungCsr(); // Hitung ulang csr
    }
    
    public void setPengListAir(double peng_list_air) {
        this.peng_list_air = peng_list_air;
        hitungPendapatanNet(); // Hitung ulang pend_net
        hitungManager(); // Hitung ulang manager
        hitungSewa(); // Hitung ulang sewa
        hitungOwner(); // Hitung ulang owner
        hitungCsr(); // Hitung ulang csr
    }
    
    public void setPengBahan(double peng_bahan) {
        this.peng_bahan = peng_bahan;
        hitungPendapatanNet(); // Hitung ulang pend_net
        hitungManager(); // Hitung ulang manager
        hitungSewa(); // Hitung ulang sewa
        hitungOwner(); // Hitung ulang owner
        hitungCsr(); // Hitung ulang csr
    }
    
    // 5. Setter untuk atribut yang dihitung (optional - jika diperlukan)
    public void setPendNet(double pend_net) {
        this.pend_net = pend_net;
        hitungManager(); // Hitung ulang manager
        hitungSewa(); // Hitung ulang sewa
        hitungOwner(); // Hitung ulang owner
        hitungCsr(); // Hitung ulang csr
    }
    
    public void setManager(double manager) {
        this.manager = manager;
    }
    
    public void setSewa(double sewa) {
        this.sewa = sewa;
    }
    
    public void setOwner(double owner) {
        this.owner = owner;
    }
    
    public void setCsr(double csr) {
        this.csr = csr;
    }
}