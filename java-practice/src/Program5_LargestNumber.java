import java.util.Scanner;

public class Program5_LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second integer number: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is largest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is largest.");
        }else{
            System.out.println("Both numbers are equal");
        }

    }
}