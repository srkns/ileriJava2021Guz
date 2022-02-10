import java.util.Scanner;
 
public class Ebob {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int ebob = 0;
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        int dongu_degiskeni = sayi1 >= sayi2 ? sayi2 : sayi1;
        
        for(int i = 1; i <= dongu_degiskeni; i++)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
    }
}