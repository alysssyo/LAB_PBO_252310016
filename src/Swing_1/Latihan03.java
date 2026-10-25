package Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname;
        String usiaInput;
        String alamat;
        int usia;


        while (true) {
            fullname = JOptionPane.showInputDialog(
                null, "Masukkan Fullname:"
            );

            if (fullname == null || fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Field fullname tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                break;
            }
        }

        while (true) {
            usiaInput = JOptionPane.showInputDialog(
                null, "Masukkan Usia:"
            );

            if (usiaInput == null || usiaInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Field usia tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            try {
                usia = Integer.parseInt(usiaInput.trim());
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Isian usia harus angka",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }

        while (true) {
            alamat = JOptionPane.showInputDialog(
                null, "Masukkan Alamat:"
            );

            if (alamat == null || alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Field alamat tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(
                    null,
                    "Masukan alamat minimum 10 karakter",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
                );
            } else {
                break;
            }
        }

        data.setFullname(fullname.trim());
        data.setUsia(usia);
        data.setAlamat(alamat.trim());

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
    }
}
