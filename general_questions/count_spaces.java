public class count_spaces {
    public static void main(String[] args) {

        String s1 = "wow is Nishant ";
        int count = 0;
        char arr[] = s1.toCharArray();
        for(char c: arr){
            if(c == ' '){
                count++;
            }
        }
        System.out.print("Count spaces"+count);
    }
}