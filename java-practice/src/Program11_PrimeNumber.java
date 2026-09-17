import java.util.Scanner;

public class Program11_PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to verify whether it is prime or not: ");
        int number = scan.nextInt();
        boolean isPrime = true;

        if(number<=1){
            isPrime = false;
        }else{
            for(int i=2; i <= number/2; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }


    }
}
