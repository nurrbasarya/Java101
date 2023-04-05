import java.util.Scanner;
public class Number {
    public static void main(String[] args) {

        int limit,kontrol=1,carpi4,carpi5, sayi=1;
        Scanner input = new Scanner(System.in);
        System.out.print(" Lutfen limit değerini giriniz");
        limit=input.nextInt();

        while (kontrol<=limit)
        {
            carpi4=sayi*4;
            carpi5=sayi*5;
            System.out.println(" Sayı : "+sayi+ " 4. Katı "+carpi4+ " 5.Katı"+ carpi5);
            sayi++;
            kontrol++;
        }

    }}
