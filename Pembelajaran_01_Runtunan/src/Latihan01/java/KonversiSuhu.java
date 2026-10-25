
package Pembelajaran_01_Runtunan;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double reamur = celsius * 4.0 / 5.0;
        double kelvin = celsius + 273.15;

        System.out.println("Hasil Konversi Suhu");
        System.out.println("Celsius    : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Reamur     : " + reamur);
        System.out.println("Kelvin     : " + kelvin);

        input.close();
    }
}
