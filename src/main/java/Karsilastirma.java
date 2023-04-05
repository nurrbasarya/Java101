import java.util.Scanner;
public class Karsilastirma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Please enter first number");
        num1=input.nextInt();
        System.out.print("Please enter second number");
        num2=input.nextInt();
        System.out.print("Please enter third number");
        num3=input.nextInt();

        if (num1>num2 && num1>num3)
        {
            if (num2>num3)
                System.out.print(num1+ " >"+ num2+">"+ num3);
            else if(num3>num2)
                System.out.print(num1+ " >"+ num3+">"+ num2);
            else
                System.out.print(num1+ " >"+ num3+"="+ num2);

        }
        if (num2>num1 && num2>num3)
        {
            if (num1>num3)
                System.out.print(num2+ " >"+ num1+">"+ num3);
            else if(num3>num1)
                System.out.print(num2+ " >"+ num3+">"+ num1);
            else
                System.out.print(num2+ " >"+ num3+"="+ num1);

        }
        if (num3>num2 && num1<num3)
        {
            if (num2>num1)
                System.out.print(num3+ " >"+ num2+">"+ num1);
            else if(num1>num2)
                System.out.print(num3+ " >"+ num1+">"+ num2);
            else
                System.out.print(num3+ " >"+ num1+"="+ num2);


        }
        else
            System.out.print(num1+ " ="+ num2+"="+ num3);

    }}