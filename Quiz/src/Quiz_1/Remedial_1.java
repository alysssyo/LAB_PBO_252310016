package Quiz_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Remedial_1 {
    public static void main(String[] args) {
        int i = 0;
        double jumlah = 0;

        int totalData = Integer.parseInt(JOptionPane.showInputDialog("Masukkan total data: ")
        );

        ArrayList<Double> data = new ArrayList<Double>();


        while (i < totalData) {
            double nilai = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Masukkan data ke-" + (i + 1) + ": "
                )
            );

            data.add(nilai);
            jumlah += data.get(i);

            i++;
        }

        double rataRata = jumlah / totalData;

        JOptionPane.showMessageDialog(null,"\nRata-rata: " + rataRata);
    }
}