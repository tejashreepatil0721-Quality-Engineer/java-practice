import java.util.Scanner;

public class Program7_MultiplicationTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number for multiplication: ");
        int num = scan.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
