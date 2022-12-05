import java.util.Scanner;
public class oddevwn {
    public static void main(String[] args) {
        int x =0;
     
        Scanner scan = new Scanner( System.in );
       System.out.println("enter the value of x ");
        x= scan.nextInt();
        
       if (x%2==0){
           System.out.println("even");
       }
       else if (x%2!=0){
           System.out.println("odd");}
    }
    
}
