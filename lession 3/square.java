import java.util.Scanner;

public class square 
{
     public static void main(String []args)
     { 
     double x1;
     double x2;
     double y1;
     double y2;
    double A;
      Scanner scan = new Scanner( System.in );
     System.out.println("enter the value of x1 cordinate ");
      x1= scan.nextDouble();
      
      System.out.println("enter the value of y1 cordinate");
   y1 = scan.nextDouble();
     
     System.out.println("enter the value of x2 cordinate ");
       x2 = scan.nextDouble();
     
     System.out.println("enter the value of y2 cordinate ");
      y2 = scan.nextDouble();
     A = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
     

      System.out.println(" total value"+A);
         

         
     }
}