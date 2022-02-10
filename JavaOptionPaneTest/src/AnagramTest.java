import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramTest {

    public AnagramTest() {

        String s1 = JOptionPane.showInputDialog("İlk kelimeyi girin");
        String s2 = JOptionPane.showInputDialog("İkinci kelimeyi girin");

        char[] s1chars = s1.toLowerCase().toCharArray();
        char[] s2chars = s2.toLowerCase().toCharArray();

        // balistik
        // sabitlik
        boolean anagram = true;
        if (s1chars.length == s2chars.length) {
            for (int i = 0; i < s1chars.length; i++) {
                int harfSayisi1 = 0;
                for (int j = 0; j < s1chars.length; j++) {
                    if (s1chars[i] == s1chars[j]) {
                        harfSayisi1++;
                    }
                }
                int harfSayisi2 = 0;
                for (int j = 0; j < s2chars.length; j++) {
                    if (s1chars[i] == s2chars[j]) {
                        harfSayisi2++;
                    }
                }
                if (harfSayisi1 != harfSayisi2) {
                    System.out.println("Anagram Değil!");
                    anagram = false;
                    break;
                }
            }
            if (anagram) {
                System.out.println("Anagram!");
            }
        } else {
            System.out.println("Anagram değil!");
        }
    }

    public static void main(String[] args) {
        new AnagramTest();
    }
}
