package basic_questions;

import java.util.Scanner;
public class sum_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int digits = num%10;
            sum += digits;
            num = num/10;
        }
        System.out.print("The sum of the digits is : " + sum);
        sc.close();
    }
    
}
