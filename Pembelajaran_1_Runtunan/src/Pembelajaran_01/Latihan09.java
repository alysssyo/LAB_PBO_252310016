
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        Integer npm = Integer.valueOf(input.nextLine());
        myBio.getNPM(npm);

        System.out.print("Masukkan Fullname: ");
        String nama = input.nextLine();
        myBio.getFullname(nama);

        System.out.print("Masukkan ClassName: ");
        String kelas = input.nextLine();
        myBio.getClassName(kelas);

        System.out.print("Masukkan Semester: ");
        Integer semester = Integer.valueOf(input.nextLine());
        myBio.getSemester(semester);

        System.out.print("Masukkan GPA: ");
        Float gpa = Float.valueOf(input.nextLine());
        myBio.getGPA(gpa);

        System.out.println("\nDATA STUDENTS");
        System.out.println("NPM      : " + npm);
        System.out.println("Fullname : " + nama);
        System.out.println("ClassName: " + kelas);
        System.out.println("Semester : " + semester);
        System.out.println("GPA      : " + gpa);

        input.close();
    }
}
