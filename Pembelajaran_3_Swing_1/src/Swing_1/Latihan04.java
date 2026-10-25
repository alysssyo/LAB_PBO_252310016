package Swing_1;

import javax.swing.JOptionPane;

public class Latihan04 {

    private static String ambilInput(
        String pesan, String field
    ) {
        while (true) {
            String input = JOptionPane.showInputDialog(
                null, pesan
            );

            if (input == null) {
                int pilihan = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah anda ingin keluar ?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION
                );

                if (pilihan == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

                continue;
            }

            if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Field " + field + " tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            return input.trim();
        }
    }

    private static int ambilUsia() {
        while (true) {
            String input = ambilInput(
                "Masukkan Usia:", "usia"
            );

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Isian usia harus angka",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static String ambilAlamat() {
        while (true) {
            String alamat = ambilInput(
                "Masukkan Alamat:", "alamat"
            );

            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(
                    null,
                    "Masukan alamat minimum 10 karakter",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
                );
            } else {
                return alamat;
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            Biodata data = new Biodata();

            String fullname = ambilInput(
                "Masukkan Fullname:", "fullname"
            );

            int usia = ambilUsia();

            String alamat = ambilAlamat();

            data.setFullname(fullname);
            data.setUsia(usia);
            data.setAlamat(alamat);

            String hasil = "DATA BIODATA\n"
                + "Fullname: " + data.getFullname() + "\n"
                + "Usia: " + data.getUsia() + "\n"
                + "Alamat: " + data.getAlamat();

            JOptionPane.showMessageDialog(
                null,
                hasil,
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE
            );

            int pilihan = JOptionPane.showConfirmDialog(
                null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );

            if (pilihan == JOptionPane.YES_OPTION) {
                break;
            }

        }
    }
}
