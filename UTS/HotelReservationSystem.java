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
public class HotelReservationSystem {
    public static void main(String[] args) {
        DataHotel dataHotel = new DataHotel();
        Reservation reservation = new Reservation(dataHotel);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Halo, Selamat Datang di Sistem Reservasi Hotel Java!");
            System.out.println("Silakan Login");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = input.nextInt();
            
            if (pilihan == 3){
                break;
            }

            switch (pilihan) {
                case 1: 
                    Customer customer = new Customer(reservation);
                    customer.displayMenu();
                    break;
                case 2: 
                    Admin admin = new Admin(dataHotel);
                    admin.displayMenu();
                    break;
                case 3: 
                    
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        System.out.println("Terimakasih telah menggunakan Sistem Reservasi Hotel Kami!");
    }
}
