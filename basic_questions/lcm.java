package basic_questions;
import java.util.Scanner;
public class lcm {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        int lcm = Math.max(a,b);
        while(true){
            if (lcm %a == 0 && lcm %b ==0){
                break;
            }
            lcm++;
        }
        System.out.print("The Lcm of two number is : "+ lcm);
        sc.close();

    }
}
