import java.util.Scanner;

public class threeaverage {
    public static void main(String[] args) {
        double first;
        double second;
        double third;



        Scanner sc= new Scanner(System.in);
        System.out.println("enter firsst  number ");
         first  =sc.nextDouble();
         System.out.println("entr the second number ");
         second =sc.nextDouble();
         System.out.println("entr the second number ");
         third=sc.nextDouble();
         System.out.println("average of three number= "+(first+second+third)/3);
       

    }
    
}
