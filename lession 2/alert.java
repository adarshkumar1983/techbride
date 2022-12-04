import java.util.Scanner;
public class alert {
    public static void main(String[] args) {
        int n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        n=sc.nextInt(); 
        if(n<1 ||n>99){
            System.out.println("Please specify a number greater than 0 and less than 100.");
        }
        else{
            System.out.println("welcome");
        }
    }
}
