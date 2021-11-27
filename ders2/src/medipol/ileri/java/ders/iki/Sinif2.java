package medipol.ileri.java.ders.iki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Ders 2 - Sınıf 2
public class Sinif2 {

    public Sinif2() {

    }

    public static void main(String[] args) {

//        Sinif2.metod2(); // static metodların cagrimi
//
//        Sinif2 sinif2 = new Sinif2();
//        sinif2.metod1(); // static olmayan metodlarin cagrimlar
//
//        int a = 5;
//        int b = 10;
//
//        if (a < b) {
//            System.out.println("a b den kucuktur");
//        } else {
//            System.out.println("a b den buyuktur yada a b ye esittir");
//        }
//
//        // inline if
//        String sonuc;
//        String aKucuk = "a b den kucuktur";
//        String aBuyuk = "a b den buyuktur";
//        String aBYeEsit = "a b ye esittir";
//        sonuc = (a < b) ? aKucuk : aBuyuk;
//        // asagida iki adet if calismaktadir
//        // sonuc = (a < b) ? aKucuk : ((a == b) ? aBYeEsit : aBuyuk);
//        System.out.println(sonuc);

//        int i = 100;
//        while(i < 10) {
//            System.out.println("i = " + i++);
//        }
//
//        for(int x = 20; x > 0; x--) {
//            System.out.println("x : " + x);
//        }

//        int x = 10;
//
//        do {
//            System.out.println("x : " + x );
//            x++;
//        } while( x < 20 );

//        char grade = 'B';
//
//        switch(grade) {
//            case 'A' :
//                System.out.println("Excellent!");
//                break;
//            case 'B' :
//            case 'C' :
//                System.out.println("Well done");
//                //break;
//            case 'D' :
//                System.out.println("You passed");
//            case 'F' :
//                System.out.println("Better try again");
//                //break;
//            default :
//                System.out.println("Invalid grade");
//        }
//        System.out.println("Your grade is " + grade);


//        int a = 5;// 32 bitlik alanda tutulan 2 lik sistemden
//        Integer b = new Integer(10);
//        a = b;
//        a = a + 20;
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//        char[] charDizisi = {'D','o'};
//        String palindrome = "Dot saw I was Tod";
//        int len = palindrome.length();
//        char c = palindrome.charAt(0);
//        System.out.println("String Length is : " + len);
//        System.out.println("c is : " + c);
//        c = palindrome.charAt(16);
//        System.out.println("c is : " + c);

//        float floatVar = 5f;
//        int intVar = 100;
//        String stringVar = new String("bişiler");
//        String formatString = "The value of the float variable is " +
//                "%.5f, while the value of the integer " +
//                "variable is %d, and the string " +
//                "is %s";
//        System.out.printf(formatString, floatVar, intVar, stringVar);
//        System.out.println("\n");
//        System.out.println("The value of the float variable is " +
//                floatVar + ", while the value of the integer " +
//                "variable is " + intVar + ", and the string " +
//                "is " + stringVar);

//        String a = "aaaa"; // serkan
//        String b = "AaAa"; // SErkan
//        //System.out.println((a.equalsIgnoreCase(b)) ? "Esit" : "değil");
//
//        String c = b.toUpperCase();
//        System.out.println("b : " + b);
//        System.out.println("c : " + c);

//        Date date = new Date();
//        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, c.get(Calendar.YEAR) - 1);
//        Date date2 = c.getTime();
//        long time = date.getTime();
//        System.out.println("date is : " + date);
//        System.out.println("date2 is : " + date2);
//        System.out.println(date2.compareTo(date));

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
        System.out.println("Current Date: " + ft.format(dNow));
        String input = "2021.10.28 23:33:15";
        Date t = null;
        try {
            t = ft.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(t);

    }

    public void metod1() {

        return;
    }

    public static void metod2() {

        return;
    }


}
