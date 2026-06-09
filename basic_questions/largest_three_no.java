package basic_questions;


import java.util.Scanner;


public class largest_three_no{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();

        System.out.print("Enter the number b");
        int b = sc.nextInt();

        System.out.print("Enter the number c");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print(a +" is larger than "+ b + " and "+ c);
        }
        else if(b>a && b>c){
            System.out.print(b +" is larger than"+ a + "and"+ c);
        }
        else{
            System.out.print(c+ " is larger than "+ a + " and "+ b);
        }
        sc.close();
    }
}