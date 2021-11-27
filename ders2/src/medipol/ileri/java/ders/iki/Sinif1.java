package medipol.ileri.java.ders.iki;

// Ders 3 - Sınıf 1
public class Sinif1 {

    public Sinif1() {
        System.out.println("Sinif 1 calisiyor");
    }

    public static void main(String[] args) {
        int minNumber = Sinif1.minFunction(5, 10);
        System.out.println("minNumber = " + minNumber);

        Sinif1 sinif1 = new Sinif1();

        int minNumber2 = sinif1.minFunction2(23, 57);
        System.out.println("minNumber2 = " + minNumber2);

        sinif1.minFunction3(34, 2342);
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public int minFunction2(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public void minFunction3(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        System.out.println("Sinif1:minFunction3: minimum number is : " + min);
    }

}
