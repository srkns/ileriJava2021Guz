import javax.swing.*;

public class JOptionPaneTestMain {

    public JOptionPaneTestMain() {
        String basamak = "\n*\n**\n***";
        JOptionPane.showMessageDialog(null, "Basamak : " + basamak, "Soru 6 Cevabı", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new JOptionPaneTestMain();
    }

}
