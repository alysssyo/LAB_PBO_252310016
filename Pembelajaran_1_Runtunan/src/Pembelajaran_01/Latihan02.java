
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan02 {
    static final double PI = Math.PI;

    static double luasSegitiga(double alas, double tinggi) {
        return alas * tinggi / 2;
    }

    static double kelilingSegitiga(double a, double b, double c) {
        return a + b + c;
    }

    static double luasLayangLayang(double d1, double d2) {
        return d1 * d2 / 2;
    }

    static double kelilingLayangLayang(double a, double b) {
        return 2 * (a + b);
    }

    static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    static double luasTabung(double r, double t) {
        return 2 * PI * r * (r + t);
    }

    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    static double luasKerucut(double r, double s) {
        return PI * r * (r + s);
    }

    static double volumePrisma(double alas, double tinggi,
                               double panjang) {
        return (alas * tinggi / 2) * panjang;
    }

    static double luasPrisma(double alas, double tinggi,
                             double sisi2, double sisi3,
                             double panjang) {
        double luasAlas = alas * tinggi / 2;
        double kelilingAlas = alas + sisi2 + sisi3;
        return 2 * luasAlas + kelilingAlas * panjang;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Segitiga");
        System.out.println("2. Layang-layang");
        System.out.println("3. Tabung");
        System.out.println("4. Prisma segitiga");
        System.out.println("5. Kerucut");
        System.out.print("Pilih bangun: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Alas: ");
                double a = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                System.out.print("Sisi lainnya 1: ");
                double b = input.nextDouble();
                System.out.print("Sisi lainnya 2: ");
                double c = input.nextDouble();

                System.out.println("Luas: "
                        + luasSegitiga(a, t));
                System.out.println("Keliling: "
                        + kelilingSegitiga(a, b, c));
                break;

            case 2:
                System.out.print("Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Sisi pendek: ");
                double s1 = input.nextDouble();
                System.out.print("Sisi panjang: ");
                double s2 = input.nextDouble();

                System.out.println("Luas: "
                        + luasLayangLayang(d1, d2));
                System.out.println("Keliling: "
                        + kelilingLayangLayang(s1, s2));
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = input.nextDouble();

                System.out.println("Volume: "
                        + volumeTabung(r, tinggi));
                System.out.println("Luas permukaan: "
                        + luasTabung(r, tinggi));
                break;

            case 4:
                System.out.print("Alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Tinggi segitiga: ");
                double ts = input.nextDouble();
                System.out.print("Sisi kedua: ");
                double sisi2 = input.nextDouble();
                System.out.print("Sisi ketiga: ");
                double sisi3 = input.nextDouble();
                System.out.print("Panjang prisma: ");
                double p = input.nextDouble();

                System.out.println("Volume: "
                        + volumePrisma(alas, ts, p));
                System.out.println("Luas permukaan: "
                        + luasPrisma(alas, ts, sisi2, sisi3, p));
                break;

            case 5:
                System.out.print("Jari-jari kerucut: ");
                double rk = input.nextDouble();
                System.out.print("Tinggi kerucut: ");
                double tk = input.nextDouble();
                System.out.print("Garis pelukis: ");
                double sk = input.nextDouble();

                System.out.println("Volume: "
                        + volumeKerucut(rk, tk));
                System.out.println("Luas permukaan: "
                        + luasKerucut(rk, sk));
                break;

            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
