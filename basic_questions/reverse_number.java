package basic_questions;
import java.util.Scanner;

public class reverse_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int original = num;
        while(num>0){
            int digits = num%10;
            reverse = reverse*10 + digits;
            num = num/10;
        }
        System.out.print("The reverse number of "+ original+ " is :"+ reverse);
        sc.close();


    }
}