package general_questions;


public class count_digits {
    public static void main(String args[]){
        String s1 = "hello4556 student123";
        int count = 0;
        char arr[] = s1.toCharArray();
        for(char ch:arr){
            if(Character.isDigit(ch)){
                count++;
            }
        }

        System.out.print("The digits in the String are: "+count);
    }
}
