import java.util.Scanner;

public class Program10_FactorialCalculation {
    public static void main(String[] args){

        System.out.print("Enter the number for factorial: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }
}
