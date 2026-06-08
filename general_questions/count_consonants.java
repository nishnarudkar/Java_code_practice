package general_questions;

public class count_consonants {
    public static void main(String[] args){
        String s1 = " Nishant is good";
        int consonants=0;
        char arr[] = s1.toCharArray();
        for(char ch:arr){
            if(Character.isLetter(ch)&&
                ch!='a'|| ch!='e'|| ch!='i'|| ch!='o'|| ch!='u' ){
                    consonants++;
                }
        }
        System.out.print("Total consonants in the string are "+consonants);
    }
}
