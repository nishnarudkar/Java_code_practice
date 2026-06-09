import java.util.Scanner;


public class prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
            System.out.print("The number is prime number");
        }
        sc.close();
    }
}
