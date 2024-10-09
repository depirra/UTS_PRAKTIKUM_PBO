/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo AMD3020E
 */

public class Reservation {
    private DataHotel dataHotel;
    private String namaCustomer;
    private int idCustomer;

    public Reservation(DataHotel dataHotel) {
        this.dataHotel = dataHotel;
    }

    public boolean pesanKamar(int idCustomer, String namaCustomer, int nomorKamar, int lamaMenginap) {
        Kamar kamar = dataHotel.getKamar(nomorKamar);
        if (kamar != null && kamar.ketersediaan()) {
            kamar.setKetersediaan(false);
            
            double totalHarga = lamaMenginap * kamar.getHarga();
            System.out.println();
            System.out.println("ID Pelanggan     : " +idCustomer);
            System.out.println("Nama Pelanggan   : " +namaCustomer);
            System.out.println(kamar.getDisplayKamar());
            System.out.println("Lama Menginap    : " +lamaMenginap+ " malam");
            System.out.println("Total Harga      : Rp. " +totalHarga);
            System.out.println("Status Reservasi : Berhasil");
            return true;
        } else {
            System.out.println("Kamar " + nomorKamar + " tidak tersedia.");
            return false;
        }
    }

    public DataHotel getDataHotel() {
        return dataHotel;
    }
}

