package pbo_uas;

public class petani {

    // atribut
    private String nama;
    private int panen_ke;
    private double pend_bruto;
    private double biaya_pupukpestisida;
    private double tenagakerja;
    private double sewa;
    
    // atribut wit rumus
    private double pend_net;
    private double owner_bruto;
    private double owner_net;
    private double penyakap_bruto;
    private double penyakap_net;

    // cons kosong
    public petani() {
        
    }

    // cons isi
    public petani(String nama, int panen_ke, double pend_bruto, double biaya_pupukpestisida, double tenagakerja, double sewa) {
        this.nama = nama;
        this.panen_ke = panen_ke;
        this.pend_bruto = pend_bruto;
        this.biaya_pupukpestisida = biaya_pupukpestisida;
        this.tenagakerja = tenagakerja;
        this.sewa = sewa;
        
        //hitung semua
        sethitungSemua(); 
    }

    
    private void sethitungSemua() {
       
        this.pend_net = this.pend_bruto - this.sewa;

        this.owner_bruto = 0.5 * this.pend_net;
        this.penyakap_bruto = 0.5 * this.pend_net;

        this.owner_net = this.owner_bruto - this.biaya_pupukpestisida;
        this.penyakap_net = this.penyakap_bruto - this.tenagakerja;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getPanen_ke() {
        return panen_ke;
    }

    public double getPend_bruto() {
        return pend_bruto;
    }

    public double getBiaya_pupukpestisida() {
        return biaya_pupukpestisida;
    }

    public double getTenagakerja() {
        return tenagakerja;
    }

    public double getSewa() {
        return sewa;
    }

    public double getPend_net() {
        return pend_net;
    }

    public double getOwner_bruto() {
        return owner_bruto;
    }

    public double getOwner_net() {
        return owner_net;
    }

    public double getPenyakap_bruto() {
        return penyakap_bruto;
    }

    public double getPenyakap_net() {
        return penyakap_net;
    }
    
    // setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPanen_ke(int panen_ke) {
        this.panen_ke = panen_ke;
    }

    public void setPend_bruto(double pend_bruto) {
        this.pend_bruto = pend_bruto;
        sethitungSemua(); // Hitung ulang jika pendapatan bruto berubah
    }

    public void setBiaya_pupukpestisida(double biaya_pupukpestisida) {
        this.biaya_pupukpestisida = biaya_pupukpestisida;
        sethitungSemua(); // Hitung ulang jika biaya pupuk berubah
    }

    public void setTenagakerja(double tenagakerja) {
        this.tenagakerja = tenagakerja;
        sethitungSemua(); // Hitung ulang jika biaya tenaga kerja berubah
    }

    public void setSewa(double sewa) {
        this.sewa = sewa;
        sethitungSemua(); // Hitung ulang jika biaya sewa berubah
    }

}