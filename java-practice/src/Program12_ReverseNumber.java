import java.util.Scanner;

public class Program12_ReverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reversed = 0;

        System.out.print("Enter a number to reverse it: ");
        int number = scan.nextInt();

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number/10;
        }

        System.out.println("Reversed number is " + reversed);
    }
}
