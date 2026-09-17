import java.util.Scanner;

public class Program9_SwapNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1 = 5, num2 = 10;
        System.out.print("Numbers before swap: " + num1 + " and " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nNumbers after swap: " + num1 + " and " + num2);

    }
}
