
import  java.util.Scanner;

public class Not_Ortalaması {
    public static void main(String[] args) {
    int mat,turkce,fizik,muzik,kimya,tarih;
    Scanner input=new Scanner(System.in);

    //Kullanıcıdan Degerleri Al
        System.out.print("Matematik Notunuz:");
        mat=input.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=input.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=input.nextInt();

        double ortalama=(mat+turkce+fizik+muzik+kimya+tarih)/6;
        System.out.print("Ortalamanız:");
        System.out.println(ortalama);

        if(ortalama<60){
            System.out.println("Sınıfta Kaldın");
        }
        else{
            System.out.println("Sınıfı Geçtin");
        }

        }
}
