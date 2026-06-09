package basic_questions;

import java.util.Scanner;



public class product_digits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if(num == 0){
            System.out.print("The product of digits is 0");
        }
        else{
            num = Math.abs(num);
            int product = 1;
        while(num>0){
            int digits = num%10;
            product*= digits;
            num = num/10;
        }
        
         System.out.print("The product of digits is : "+ product);
        }
       
        sc.close();

    }
}
