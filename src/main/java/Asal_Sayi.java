import java.util.Scanner;

public class Asal_Sayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose a number between 1-100 : ");
        int chosenNum = scanner.nextInt();
        System.out.println("*************************************");
        int i;
        while(chosenNum < 1 || chosenNum > 100){
            System.out.print("Please be sure the number doesn't exceed the range! ");
            chosenNum = scanner.nextInt();
        }

        for(i = 1; i < 100; i++);
        if(chosenNum == 2){
            System.out.println(chosenNum + " " + "is a prime number!");
        }
        else if(chosenNum % i !=0 && chosenNum % 2 !=0){
            System.out.println(chosenNum + " " + " is a prime number!");
        }else{
            System.out.println(chosenNum + " " + "isn't a prime number!");
        }
    }
}