/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tesdarah;



public class asamurat extends TESdarah {

    int umur;
    float nilai;

    void setU(int u) {
        umur = u;
    }

    void setN(float n) {
        nilai = n;
    }

    int getU() {
        return umur;
    }

    float getN() {
        return nilai;
    }

    asamurat() {
    }

    ;
    asamurat(float n, int u) {
        umur = u;
        nilai = n;

    }

    String kriteria() {

        if (JK) {
            if (umur >= 10 && umur <= 18) {
                if (nilai <= 5.5 && nilai >= 3.6) {
                    System.out.println("normal");
                } else {
                    System.out.println("SG NORMAL BROO");
                }

            } else if (umur >= 19 && umur <= 40) {
                if (nilai <= 7.5 && nilai >= 2) {
                    System.out.println("normal");
                } else {
                    System.out.println("SG VROOO");
                }
            } else if (umur > 40) {
                if (nilai >= 2 && nilai <= 8.5) {
                    System.out.println("normal");
                } else {
                    System.out.println("SG VROOO");
                }
            }
        } else {
            if (umur >= 19 && umur <= 40) {
                if (nilai <= 6.5 && nilai >= 2) {
                    System.out.println("normal");
                } else {
                    System.out.println("SG NORMAL BROO");
                }

            } else if (umur > 40) {
                if (nilai <= 8 && nilai >= 2) {
                    System.out.println("normal");
                } else {
                    System.out.println("SG VROOO");
                }
            } else if (umur >= 10 && umur <= 18) {
                if (nilai >= 3.6 && nilai <= 4) {
                    System.out.println("normal");
                } else {
                     System.out.println("SG VROOO");
                }
            }
        }
        return "Kriteria tidak diketahui";
    }
      
    public static void main(String[] args) {
          
        }
}
    
 
    
  



        

