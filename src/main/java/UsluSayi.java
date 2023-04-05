import java.util.Scanner;
public class UsluSayi{
    public static void main(String[] args) {

        int taban,kuvvet,deger=1;
        Scanner input = new Scanner(System.in);
        System.out.print(" Tabanı  Giriniz");
        taban=input.nextInt();
        System.out.print("Kuvveti Giriniz");
        kuvvet=input.nextInt();

        for (int i=1; i<=kuvvet;i++)
        {
            deger=deger*taban;

        }
        System.out.print("Sonuc: "+ deger);
    }
}