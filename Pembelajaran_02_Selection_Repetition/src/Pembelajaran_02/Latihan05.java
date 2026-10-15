package Pembelajaran_02;

public class Latihan05 {
    public static void main(String[] args) {
        long npm = 12345; // Ganti dengan NPM kamu
        int n = 5;

        if (npm % 2 != 0) {
            int i = 0;

            while (i < n) {
                int j = 0;

                while (j < n) {
                    if (i == 0 || i == n - 1 ||
                        j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    j++;
                }

                System.out.println();
                i++;
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 ||
                        j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}