import java.util.Scanner;



public class string_to_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("Enter first number");
        a = sc.nextLine();
        System.out.println("Enter second number");
        b = sc.nextLine();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        System.out.println("Addition is " + (num1+num2));
        sc.close();
    }
}
