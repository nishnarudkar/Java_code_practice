package basic_questions;


import java.util.Scanner;

public class factorial_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = 1;
        for(int i = num; i>=1; i--){
            result*=i;
        }
        System.out.print(result);
        sc.close();
    }
}
