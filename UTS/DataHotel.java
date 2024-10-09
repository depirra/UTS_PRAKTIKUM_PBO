/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo AMD3020E
 */
public class DataHotel {
    private Kamar k1 = new Kamar(101, "Standard", 500000);
    private Kamar k2 = new Kamar(201, "Superior", 750000);
    private Kamar k3 = new Kamar(301, "Suite", 1100000);
    private Kamar k4 = new Kamar(401, "Deluxe", 1500000);
    private Kamar k5 = new Kamar(501, "Presidential", 2000000);

    public void displayKamarTersedia() {
        System.out.println("====Daftar Kamar Tersedia====");
        if (k1.ketersediaan()) System.out.println(k1.getDisplayKamar());
        System.out.println();
        if (k2.ketersediaan()) System.out.println(k2.getDisplayKamar());
        System.out.println();
        if (k3.ketersediaan()) System.out.println(k3.getDisplayKamar());
        System.out.println();
        if (k4.ketersediaan()) System.out.println(k4.getDisplayKamar());
        System.out.println();
        if (k5.ketersediaan()) System.out.println(k5.getDisplayKamar());
        System.out.println();
    }
    
    public Kamar getKamar(int nomorKamar) {
        switch (nomorKamar) {
            case 101: return k1;
            case 201: return k2;
            case 301: return k3;
            case 401: return k4;
            case 501: return k5;
            default: return null; 
        }
    }
    public void menambahKamar(Kamar kamar) {
        if (kamar.getNomorKamar() == 102) { 
            k1 = kamar; 
            System.out.println(kamar.getDisplayKamar());
            System.out.println("Kamar Berhasil Ditambahkan");
        } else {
            System.out.println("Gagal Menambahkan Kamar");
        }
    }
}
