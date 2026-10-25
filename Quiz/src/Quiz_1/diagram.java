package Quiz_1;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class diagram {
    public static void main(String[] args) {

    	JOptionPane jop = new JOptionPane();
        ArrayList<String> judul = new ArrayList<String>();
        int confirm;

        do {
            String buku = JOptionPane.showInputDialog(
                null,
                "Masukkan judul buku:",
                "Judul Buku",
                JOptionPane.QUESTION_MESSAGE
            );

            if (buku == null) {
                return;
            }

            judul.add(buku);

            confirm = JOptionPane.showConfirmDialog(
                null,
                "Apakah ingin memasukkan buku lagi?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );

        } while (confirm == 0);

        String hasil = "";

        for (int i = 0; i < judul.size(); i++) {
            hasil += judul.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(
            null,
            "Daftar Seluruh Buku: \n" + hasil
        );
    }
}
