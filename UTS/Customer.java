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
public class Customer implements Pengguna{
    private Reservation reservation;
    private Scanner input;

    public Customer(Reservation reservation) {
        this.reservation = reservation;
        this.input = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        while (true) {
            System.out.println();
            System.out.println("Silakan Pilih Menu");
            System.out.println("1. Kamar Tersedia");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Kembali");
            System.out.print("Pilih Opsi: ");
            int pilihan = input.nextInt();
            System.out.println();
            
            if (pilihan == 3){
                break;
            }

            switch (pilihan) {
                case 1:
                    reservation.getDataHotel().displayKamarTersedia();
                    break;
                case 2:
                    System.out.print("Masukkan ID : ");
                    int idCustomer = input.nextInt();
                    System.out.print("Masukkan Nama : ");
                    String namaCustomer = input.next();
                    System.out.print("Masukkan Nomor Kamar yang Ingin Dipesan: ");
                    int nomorKamar = input.nextInt();
                    System.out.print("Masukkan Lama Menginap (malam): ");
                    int lamaMenginap = input.nextInt();
                    reservation.pesanKamar(idCustomer, namaCustomer, nomorKamar, lamaMenginap);
                    break;
                default:
                    System.out.println("Opsi salah. Coba lagi.");
            }
        }
    }
}

