<<<<<<< HEAD
package Pembelajaran_02;

public class Latihan02 {
    public static void main(String[] args) {
        long npm = 252310016;
        boolean prima = true;

        if (npm < 2) {
            prima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println(
                "Bukan termasuk bilangan prima karena dapat dibagi dengan 2 atau bilangan lainnya."
            );
        }
    }
=======
package Pembelajaran_02;

public class Latihan02 {
    public static void main(String[] args) {
        long npm = 252310016;
        boolean prima = true;

        if (npm < 2) {
            prima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(npm); i++) {
                if (npm % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println(
                "Bukan termasuk bilangan prima karena dapat dibagi dengan 2 atau bilangan lainnya."
            );
        }
    }
>>>>>>> db53543a3f80404fb8502cbc511eda2898f15e3c
}