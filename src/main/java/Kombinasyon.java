import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {

        int sayi1, sayi2,sayi1fak=1, sayi2fak=1, sayi12fak=1, kombinasyon, k1,k2,k3;
        Scanner input = new Scanner(System.in);
        System.out.print(" 1. Sayıyı Giriniz");
        sayi1=input.nextInt();
        System.out.print(" 2. Sayıyı Giriniz");
        sayi2=input.nextInt();
        k3=sayi1-sayi2;
        k1=sayi1; k2=sayi2;
        while (k1>=1 && k2>=1 && k3>=1){
            sayi1fak=sayi1fak*k1;
            sayi2fak=sayi2fak*k2;
            sayi12fak=sayi12fak*k3;
            k1--;
            k2--;
            k3--;

        }
        kombinasyon= sayi1fak/(sayi2fak*sayi12fak);
        System.out.println("Kombinasyon = "+kombinasyon);
    }
}