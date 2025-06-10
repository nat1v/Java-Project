
package uas;

import java.util.Date;


abstract class orang {

    String Nama;
    boolean isLaki;
    Date TanggalLahir;
            
    String getNama(){
        return Nama;
    }
    boolean getJK(){
        return isLaki;
    }
    
    Date getTanggalLahir(){
        return TanggalLahir;
    }
    
    
    void setTanggalLahir(Date Tanggal){
        TanggalLahir = Tanggal;
    }
    
    void setNama(String nm){
        Nama = nm;
    }
    
    void setJK(boolean jk){
        isLaki = jk;
    }
    
    orang(){};
    orang(String nm, boolean jk){
        Nama = nm;
        isLaki = jk;
        
    }
    abstract String hobi();
 

}
