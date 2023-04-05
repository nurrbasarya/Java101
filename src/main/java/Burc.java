import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int group;
        System.out.print("Please choose your group from list below");
        System.out.print("Group1 : 21 March - 20 April ");
        System.out.print("Group2 : 21 April - 21 May ");
        System.out.print("Group3 : 22 May - 22 June ");
        System.out.print("Group4 : 23 June - 22 July ");
        System.out.print("Group5 : 23 July - 22 August ");
        System.out.print("Group6 : 23 August - 22 September ");
        System.out.print("Group7 : 23 September - 22 October ");
        System.out.print("Group8 : 23 October - 22 November ");
        System.out.print("Group9 : 23 November - 21 December ");
        System.out.print("Group10 : 22 December - 21 January ");
        System.out.print("Group11 : 22 January - 19 February ");
        System.out.print("Group12 : 20 February - 20 March ");
        group=input.nextInt();
        if (group==1)
            System.out.print(" Your horoscope is Aries");
        else if (group==2)
            System.out.print(" Your horoscope is Taurus");
        else if (group==3)
            System.out.print(" Your horoscope is Gemini");
        else if (group==4)
            System.out.print(" Your horoscope is Cancer");
        else if (group==5)
            System.out.print(" Your horoscope is Leo");
        else if (group==6)
            System.out.print(" Your horoscope is Virgo");
        else if (group==7)
            System.out.print(" Your horoscope is Libra");
        else if (group==8)
            System.out.print(" Your horoscope is Scorpio");
        else if (group==9)
            System.out.print(" Your horoscope is Sagittarius");
        else if (group==10)
            System.out.print(" Your horoscope is Capricorn");
        else if (group==11)
            System.out.print(" Your horoscope is Aquarius");
        else if (group==12)
            System.out.print(" Your horoscope is Pisces");

    }}