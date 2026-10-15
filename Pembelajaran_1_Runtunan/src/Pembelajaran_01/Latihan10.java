
package Pembelajaran_01;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        final int HARGA = 6300;

        System.out.print("Masukkan nama member: ");
        String namaMember = myBio.getFullname(input.nextLine());

        System.out.print("Masukan jumlah produk yang dibeli: ");
        int qty = input.nextInt();

        int total = HARGA * qty;
        double diskon = 0;

        if (qty > 0 && qty % 3 == 0) {
            diskon = total * 0.05;
        }

        double subtotal = total - diskon;

        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("================================================");
        System.out.println("             TOKO SERBAGUNA IBIK");
        System.out.println("================================================");
        System.out.println("Masukan jumlah produk yang dibeli: " + qty);
        System.out.println();
        System.out.println(sekarang.format(format));

        System.out.printf("%-15s %5s %12s %12s%n",
                "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("------------------------------------------------");

        System.out.printf("%-15s %5d Rp %,9d Rp %,9d%n",
                "ROTI ENAK.", qty, HARGA, total);

        System.out.println("------------------------------------------------");
        System.out.printf("Diskon    : %.0f%%%n",
                total == 0 ? 0 : diskon / total * 100);
        System.out.printf("Sub Total : Rp %,.0f%n", subtotal);
        System.out.println("Member Name : " + namaMember);
        System.out.println("================================================");

        input.close();
    }
}
