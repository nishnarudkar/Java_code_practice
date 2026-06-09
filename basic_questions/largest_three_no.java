public class largest_three_no{
    public static void main(String[] args){
        int a = 10; 
        int b = 15;
        int c = 20;

        if(a>b && a>c){
            System.out.print(a +" is larger than "+ b + " and "+ c);
        }
        else if(b>a && b>c){
            System.out.print(b +" is larger than"+ a + "and"+ c);
        }
        else{
            System.out.print(c+ " is larger than "+ a + " and "+ b);
        }
    }
}