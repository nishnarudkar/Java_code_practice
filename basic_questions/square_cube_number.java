import java.util.Scanner;

public class square_cube_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Square of number is : " + (a * a));
        System.out.println("Cube of number is : " + (a * a * a));
        sc.close();
    }
    
}
