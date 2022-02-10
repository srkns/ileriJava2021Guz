package tr.edu.medipol.ilerijavauyg.vizeprojeodevi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MidtermProjectController {

    @GetMapping("/")
    public String summary() {
        return "İleri Java Uygulamaları - Vize Proje Ödevi";
    }

    @GetMapping("/question_one")
    public Integer[] cylinder(@RequestParam(value = "yaricap", defaultValue = "4") Integer r,
                              @RequestParam(value = "yukseklik", defaultValue = "4") Integer h) {
        Integer pi = 3;
        Integer hacim = pi * r * r * h;
        Integer alan = 2 * pi * r * h + 2 * pi * r * r;
        return new Integer[]{hacim, alan};
    }

    @GetMapping("/question_two")
    public Integer[] kilometerConverter(@RequestParam(value = "kilometre", defaultValue = "10") Integer km) {
        Integer metre = km * 1000;
        Integer santimetre = metre * 100;
        return new Integer[]{metre, santimetre};
    }

    @GetMapping("/question_three")
    public Integer[] nCalculate(@RequestParam(value = "limit", defaultValue = "5") Integer n) {
        Integer ciftSayilarToplam = 0;
        Integer tekSayilarinKareleriToplami = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
            if (i % 2 == 0) {
                ciftSayilarToplam += i;
                System.out.println("i çift = " + i);
            } else {
                tekSayilarinKareleriToplami = tekSayilarinKareleriToplami + i * i;
                System.out.println("i tek = " + i);
            }
            System.out.println("ciftSayilarToplam=" + ciftSayilarToplam + " tekSayilarinKareleriToplami=" + tekSayilarinKareleriToplami);
        }
        System.out.println("ciftSayilarToplam=" + ciftSayilarToplam + " tekSayilarinKareleriToplami=" + tekSayilarinKareleriToplami);
        return new Integer[]{ciftSayilarToplam, tekSayilarinKareleriToplami};
    }

    @GetMapping("/question_four")
    public double[] degreeToRadAndGrad(@RequestParam(value = "derece", defaultValue = "180") Integer degree) {
        double radyan = Math.toRadians(degree);
        double grad = degree.doubleValue() * ((double) 10 / 9);
        return new double[]{radyan, grad};
    }

    @GetMapping("/question_five")
    public List<Integer> findPrimeNumbers(@RequestParam(value = "limit", defaultValue = "50") Integer n) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (n == 2) {
            primeNumbers.add(n);
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i%j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers.add(i);
                }
            }
        }
        return primeNumbers;
    }

    @GetMapping("/question_six")
    public String steps(@RequestParam(value = "sayi", defaultValue = "10") Integer i) {
        String donus;
        String basamak = "";
        try {
            File dosya = new File("basamak.txt");
            dosya.createNewFile();
            FileWriter fileWriter = new FileWriter(dosya);
            for (int j = 0; j < i; j++) {
                for (int k = 0; k <= j; k++) {
                    fileWriter.write("*");
                    basamak+="*";
                }
                fileWriter.write("\n");
                basamak += "\n";
            }
            fileWriter.close();
            System.out.println(basamak);
            donus = "Dosya oluşturuldu. İşlem başarılı. Dosya adresi : " + dosya.getAbsolutePath();
        } catch (Exception e) {
            donus = "İşlem başarısız. Hata : " + e.getMessage();
        }
        return donus;
    }

    @GetMapping("/question_seven")
    public Integer[] findHCFandLCM(@RequestParam(value = "ilk_sayi", defaultValue = "3") Integer a,
                                  @RequestParam(value = "ikinci_sayi", defaultValue = "4") Integer b) {
        Integer obeb = 1;
        Integer okek = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i == 0 && b%i == 0) {
                obeb = i;
            }
        }
        okek = (a * b) / obeb;
        return new Integer[]{obeb, okek};
    }

    @GetMapping("/question_eight")
    public String anagram(@RequestParam(value = "kelime_1", defaultValue = "Balistik") String k1,
                              @RequestParam(value = "kelime_2", defaultValue = "Sabitlik") String k2) {
        String anagramMı = "HAYIR";
        if (k1.length() == k2.length()) {
            k1 = k1.toLowerCase();
            k2 = k2.toLowerCase();
            char[] k1Chars = k1.toCharArray();
            char[] k2Chars = k2.toCharArray();
            Arrays.sort(k1Chars);
            Arrays.sort(k2Chars);
            if (Arrays.equals(k1Chars, k2Chars)) {
                anagramMı = "EVET";
            }
        }
        return anagramMı;
    }

}
