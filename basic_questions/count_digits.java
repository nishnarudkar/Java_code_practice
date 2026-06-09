package basic_questions;


import java.util.Scanner;
public class count_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if(num ==0){
            System.out.print("The number of digit is 1");
        }
        else{
            num = Math.abs(num);
            int count = 0;
            while(num>0){
                count++;
                num = num/10;

            }
            System.out.print("The number of digits are "+ count);
        }
            sc.close();
        }
    }
