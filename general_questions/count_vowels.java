package general_questions;

public class count_vowels {
    public static void main(String[] args){
    String s1 = "Nishant is good";
    char arr[]= s1.toLowerCase().toCharArray();
    int vowels = 0;
    for(char ch:arr){
        if(ch=='a'|| ch == 'e'|| ch=='i'|| ch=='o' || ch=='u'){
            vowels++;
        }

    }
    System.out.print("Total vowels in the String are:"+vowels);
}
}
