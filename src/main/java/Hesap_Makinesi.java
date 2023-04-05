import java.util.Scanner;
public class Hesap_Makinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secim,sayi1,sayi2;
        double sonuc;
        System.out.println("Istediginiz islem icin numara seciniz");
        System.out.println("1. Toplama 2. Cıkarma 3. Bolme 4. Toplama");
        secim=input.nextInt();
        switch (secim)
        {
            case 1:
                System.out.println("1. Sayiyi Giriniz");
                sayi1=input.nextInt();
                System.out.println("2. Sayiyi Giriniz");
                sayi2=input.nextInt();
                sonuc=sayi1+sayi2;
                System.out.println("Toplam : "+sonuc);
                break;

            case 2:
                System.out.println("1. Sayiyi Giriniz");
                sayi1=input.nextInt();
                System.out.println("2. Sayiyi Giriniz");
                sayi2=input.nextInt();
                sonuc=sayi1-sayi2;
                System.out.println("Fark : "+sonuc);
                break;

            case 3:
                System.out.println("1. Sayiyi Giriniz");
                sayi1=input.nextInt();
                System.out.println("2. Sayiyi Giriniz");
                sayi2=input.nextInt();
                sonuc=sayi1/sayi2;
                System.out.println("Bolum : "+sonuc);
                break;

            case 4:
                System.out.println("1. Sayiyi Giriniz");
                sayi1=input.nextInt();
                System.out.println("2. Sayiyi Giriniz");
                sayi2=input.nextInt();
                sonuc=sayi1+sayi2;
                System.out.println("Carpım : "+sonuc);
                break;

            default:
                System.out.println("Gecersiz Numara");
        }






    }
}
