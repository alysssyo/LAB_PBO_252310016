
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan String: ");
        String teks = input.nextLine();

        System.out.println(teks.toUpperCase());

        input.close();
    }
}
