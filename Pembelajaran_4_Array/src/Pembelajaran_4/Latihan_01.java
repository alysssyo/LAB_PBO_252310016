package Pembelajaran_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan_01 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int nilai = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai matriks A[" + i + "][" + j + "]"
                    )
                );
                baris.add(nilai);
            }
            A.add(baris);
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int nilai = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Masukkan nilai matriks B[" + i + "][" + j + "]"
                    )
                );
                baris.add(nilai);
            }
            B.add(baris);
        }

        String hasil = "MATRIKS A:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A.get(i).get(j) + "\t";
            }
            hasil += "\n";
        }

        hasil += "\nMATRIKS B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B.get(i).get(j) + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}

