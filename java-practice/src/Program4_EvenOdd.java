import java.util.Scanner;

public class Program4_EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is Even number");
        }
        else{
            System.out.println(number + " is Odd number");
        }
    }
}
