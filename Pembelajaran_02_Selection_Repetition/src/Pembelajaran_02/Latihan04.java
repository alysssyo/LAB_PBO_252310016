<<<<<<< HEAD
package Pembelajaran_02;

public class Latihan04 {
    public static void main(String[] args) {
        long npm = 252310016;
        int angka = 25;

        if (npm % 2 == 0) {
            System.out.print("ASC: Faktor " + angka + " adalah ");

            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("DESC: Faktor " + angka + " adalah ");

            for (int i = angka; i >= 1; i--) {
                if (angka % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
    }
=======
package Pembelajaran_02;

public class Latihan04 {
    public static void main(String[] args) {
        long npm = 252310016;
        int angka = 25;

        if (npm % 2 == 0) {
            System.out.print("ASC: Faktor " + angka + " adalah ");

            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("DESC: Faktor " + angka + " adalah ");

            for (int i = angka; i >= 1; i--) {
                if (angka % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
    }
>>>>>>> db53543a3f80404fb8502cbc511eda2898f15e3c
}