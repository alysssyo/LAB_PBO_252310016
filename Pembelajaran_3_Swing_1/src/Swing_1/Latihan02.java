package Swing_1;


import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
            null, "Masukkan Fullname:"
        );

        String usiaInput = JOptionPane.showInputDialog(
            null, "Masukkan Usia:"
        );

        String alamat = JOptionPane.showInputDialog(
            null, "Masukkan Alamat:"
        );

        int usia = Integer.parseInt(usiaInput);

        data.setFullname(fullname);
        data.setUsia(usia);
        data.setAlamat(alamat);

        String hasil = "DATA BIODATA\n"
            + "Fullname: " + data.getFullname() + "\n"
            + "Usia: " + data.getUsia() + "\n"
            + "Alamat: " + data.getAlamat();

        JOptionPane.showMessageDialog(
            null, hasil, "Informasi Biodata",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
