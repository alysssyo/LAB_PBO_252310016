<<<<<<< HEAD
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double reamur = celsius * 4.0 / 5.0;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Reamur    : " + reamur);
        System.out.println("Kelvin    : " + kelvin);

        input.close();
    }
}
=======
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double reamur = celsius * 4.0 / 5.0;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Reamur    : " + reamur);
        System.out.println("Kelvin    : " + kelvin);

        input.close();
    }
}
>>>>>>> db53543a3f80404fb8502cbc511eda2898f15e3c
