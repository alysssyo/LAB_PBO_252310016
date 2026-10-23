<<<<<<< HEAD
package Pembelajaran_01;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Konversi Suhu");
            System.out.println("2. Hitung Bangun");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                	Latihan02.main(new String[0]);
                    break;

                case 2:
                	Latihan03.main(new String[0]);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
=======
package Pembelajaran_01;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Konversi Suhu");
            System.out.println("2. Hitung Bangun");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                	Latihan02.main(new String[0]);
                    break;

                case 2:
                	Latihan03.main(new String[0]);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
>>>>>>> db53543a3f80404fb8502cbc511eda2898f15e3c
}