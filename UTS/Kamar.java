/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo AMD3020E
 */
public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double harga;
    private boolean ketersediaan;

    public Kamar(int nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.ketersediaan = true;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }
    public double getHarga() {
        return harga;
    }

    public boolean ketersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean tersedia) {
        ketersediaan = tersedia;
    }

    public String getDisplayKamar() {
        return "Nomor Kamar      : " + nomorKamar + 
               "\nTipe Kamar       : " + tipeKamar + 
               "\nHarga Per-Malam  : Rp. " + harga;
    }
}
