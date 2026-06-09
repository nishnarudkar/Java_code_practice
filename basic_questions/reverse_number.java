import java.util.Scanner;

public class reverse_number {

    static int rev(int no) {
        int r = 0;

        while (no > 0) {
            int ld = no % 10;
            r = r * 10 + ld;
            no = no / 10;
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        System.out.println("Reversed number: " + rev(no));

        sc.close();
    }
}