/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Lenovo AMD3020E
 */
import java.util.Scanner;
public class Admin implements Pengguna {
    private DataHotel dataHotel;
    private Scanner input;

    public Admin(DataHotel dataHotel) {
        this.dataHotel = dataHotel;
        this.input = new Scanner(System.in);
    }
    
    @Override
    public void displayMenu() {
        while (true) {
            System.out.println();
            System.out.println("Silakan Pilih Menu");
            System.out.println("1. Kamar Tersedia");
            System.out.println("2. Tambah Kamar ");
            System.out.println("3. Kembali");
            System.out.print("Pilih Opsi: ");
            int pilihan = input.nextInt();
            System.out.println();
            
            if (pilihan == 3){
                break;
            }
            
            switch (pilihan) {
                case 1:
                    dataHotel.displayKamarTersedia();
                    break;
                case 2:
                    menuMenambahKamar();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
        
    private void menuMenambahKamar() {
        System.out.print("Masukkan nomor kamar : ");
        int nomorKamar = input.nextInt();
        System.out.print("Masukkan tipe kamar : ");
        String tipeKamar = input.next();
        System.out.print("Masukkan harga kamar per malam : ");
        double harga = input.nextDouble();
        System.out.println();

        Kamar newKamar = new Kamar(nomorKamar, tipeKamar, harga);
        dataHotel.menambahKamar(newKamar);
    }
}
