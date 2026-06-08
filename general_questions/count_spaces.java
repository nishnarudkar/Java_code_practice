package general_questions;

public class count_spaces{
    public static void main(String[] args){
        String s1= "  Nishant is a good ";
        int count = 0;
        char arr[]= s1.toCharArray();
        for(char c:arr){
            if(c == ' '){
                count++;
            }
        }
        System.out.print("Count of the spaces is :"+ count);
    }
}