/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesdarah;


abstract class TESdarah {

    String golongan;
    boolean JK;
    
    TESdarah() {
    }

    ;
    TESdarah(String gol, boolean J) {
        this.golongan = gol;
        this.JK = J;
    }

    void setGol(String gol) {
        golongan = gol;
    }

    void setJK(boolean jk) {
        JK = jk;
    }

    String getGol() {
        return golongan;
    }

    boolean getJK() {
        return JK;
    }

    abstract String kriteria();
}

