import java.util.Scanner;

public class recieve{
    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        n1=sc.nextDouble();
        System.out.println("enter the second number");
        n2=sc.nextDouble();
        System.out.println("enter the third number");
        n3=sc.nextDouble();
          if(n1>n2){
            System.out.println(n1+"is a gratest number ");
          }
          else if (n2>n3){
            System.out.println(n2+"is a gratest number ");

          }
          else {
            System.out.println(n3+"is a gratest number ");
          }


        
    }
}