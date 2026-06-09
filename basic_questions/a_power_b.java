import java.util.Scanner;


public class a_power_b {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        long power = 1;
        for(int i =1; i<= b; i++){
            power = power*a;
        }
        System.out.println(power);
        sc.close();
    }
    
}
