package general_questions;

public class palindrome {
    public static void main(String[] args){
    String s1 = "wow";

    String reversed = new StringBuilder(s1).reverse().toString();
    if(s1.equals(reversed)){
        System.out.print("It is palindrome");
    }
    else{
        System.out.print("It is not a palindrome");
    }

  }
}
