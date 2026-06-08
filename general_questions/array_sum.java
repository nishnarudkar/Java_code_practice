package general_questions;


public class array_sum {
    public static void main(String [] args){
        int x[] = new int[]{10,20,30,40,50};
        int sum = 0;
            for(int i = 0; i < x.length; i++){
                sum += x[i];
            }
            System.out.print("Sum is " + sum);
    }
}
