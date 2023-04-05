import java.util.Scanner;
public class Number {
    public static void main(String[] args) {

        int limit,kontrol=1,carpı4,carpı5, sayı=1;
        Scanner input = new Scanner(System.in);
        System.out.print(" Lutfen limit değerini giriniz");
        limit=input.nextInt();

        while (kontrol<=limit)
        {
            carpı4=sayı*4;
            carpı5=sayı*5;
            System.out.println(" Sayı : "+sayı+ " 4. Katı "+carpı4+ " 5.Katı"+ carpı5);
            sayı++;
            kontrol++;
        }

    }}
