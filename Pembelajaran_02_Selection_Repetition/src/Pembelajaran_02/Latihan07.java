package Pembelajaran_02;

class Resto {
    private long Harga;

    private long getPrices(int pilihan) {
        switch (pilihan) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
        }

        return Harga;
    }

    public void chooseMenu(int pilihan) {
        long harga = getPrices(pilihan);

        switch (pilihan) {
            case 1:
                System.out.println(
                    "Anda memesan Nasi Goreng dengan harga Rp "
                    + harga + ",-"
                );
                break;
            case 2:
                System.out.println(
                    "Anda memesan Bubur Ayam dengan harga Rp "
                    + harga + ",-"
                );
                break;
            case 3:
                System.out.println(
                    "Anda memesan Soto Ayam dengan harga Rp "
                    + harga + ",-"
                );
                break;
            default:
                System.out.println(
                    "Maaf menu yang anda masukan salah."
                );
        }
    }
}

public class Latihan07 {
    public static void main(String[] args) {
        Resto resto = new Resto();

        resto.chooseMenu(1);
    }
}