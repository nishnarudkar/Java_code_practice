package basic_questions;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original = num;
            int count = 0;
            if(num == 0){
                System.out.print("It is an Armstrong number");
                sc.close();
                return;
            }
            while(num>0){
                num = num/10;
                count++;
            }
            int sum = 0;
            int temp = original;
            while(temp>0){
                int digit = temp%10;
                sum+= (int) Math.pow(digit,count);
                temp = temp/10;
            }
            if(sum == original){
                System.out.print("It is an Armstrong number");
            }
            else{
                System.out.print("It is not an Armstrong number");
            }
            
        sc.close();
        

    }
    
}
