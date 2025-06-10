/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author 0xr00t
 */
public class Mahasiswa extends orang {

    int NIM;
    String prodi;
    boolean status;
    
    int getNIM(){
        return NIM;
    }
    String getProdi(){
        return prodi;
    }
    boolean getStatus(){
        return status;
    }
    
    void setNIM(int nim){
        NIM = nim;
    }
    void setProdi(String prd){
        prodi = prd;
    }
    void setStatus(boolean st){
        status = st;
    }
    
    @Override
    String hobi() {
        String hobiSekarang = "";
        
        return hobiSekarang;
    }
    
}
