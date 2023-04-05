import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number : ");
        int number = scanner.nextInt();
        System.out.println("*******************************");

        while(number < 0){
            System.out.println("The number should be in a positive range " +
                    ",please enter again! ");
            number = scanner.nextInt();
        }

        int sum = 0;

        for(int i = 1; i<number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(number == sum){
            System.out.println(number + " " + "is a perfect number!");
        }else{
            System.out.println(number + " " + "isn't a perfect number!");
        }

    }
}