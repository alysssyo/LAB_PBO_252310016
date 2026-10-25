<<<<<<< HEAD
package Pembelajaran_02;

public class Latihan10 {
    public static void main(String[] args) {
        String pinBenar = "12345"; // Ganti dengan NPM kamu
        String pinMasuk = "12345";

        long saldo = 500000;

        if (pinMasuk.equals(pinBenar)) {
            System.out.println("PIN benar.");

            int menu = 1;

            switch (menu) {
                case 1:
                    System.out.println("=== MENU ATM ===");
                    System.out.println("Lihat Saldo");
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    long setor = 100000;
                    saldo += setor;

                    System.out.println("Setor tunai berhasil.");
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 3:
                    long tarik = 50000;

                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Saldo Anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;

                case 4:
                    System.out.println(
                        "Terimakasih telah menggunakan ATM."
                    );
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } else {
            System.out.println("PIN salah.");
        }
    }
=======
package Pembelajaran_02;

public class Latihan10 {
    public static void main(String[] args) {
        String pinBenar = "12345"; // Ganti dengan NPM kamu
        String pinMasuk = "12345";

        long saldo = 500000;

        if (pinMasuk.equals(pinBenar)) {
            System.out.println("PIN benar.");

            int menu = 1;

            switch (menu) {
                case 1:
                    System.out.println("=== MENU ATM ===");
                    System.out.println("Lihat Saldo");
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    long setor = 100000;
                    saldo += setor;

                    System.out.println("Setor tunai berhasil.");
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 3:
                    long tarik = 50000;

                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Saldo Anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;

                case 4:
                    System.out.println(
                        "Terimakasih telah menggunakan ATM."
                    );
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } else {
            System.out.println("PIN salah.");
        }
    }
>>>>>>> db53543a3f80404fb8502cbc511eda2898f15e3c
}