package Pembelajaran_02;

public class Latihan06 {
    public static void main(String[] args) {
        int pilihan = 1;
        char ulang = 'y';

        do {
            switch (pilihan) {
                case 1:
                    System.out.println(
                        "Anda memesan Nasi Goreng dengan harga Rp 22.000,-"
                    );
                    break;

                case 2:
                    System.out.println(
                        "Anda memesan Bubur Ayam dengan harga Rp 15.000,-"
                    );
                    break;

                case 3:
                    System.out.println(
                        "Anda memesan Soto Ayam dengan harga Rp 25.000,-"
                    );
                    break;

                default:
                    System.out.println(
                        "Maaf menu yang anda masukan salah."
                    );
            }

            ulang = 'n'; // Ubah menjadi 'y' untuk mengulang

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");
    }
}