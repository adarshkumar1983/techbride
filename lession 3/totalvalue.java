import java.util.Scanner;

import javax.naming.NamingEnumeration;

public class totalvalue {
    
public static void main(String[] args) {
 double principle;
 double rateofintrest;
 double number_of_time;
 double time;
 double A;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the principle");
 principle=sc.nextDouble();
 System.out.println("enter the rate of intrest");
 rateofintrest=sc.nextDouble();
 System.out.println("enter the number of times that interest is compounded per unit t");
 number_of_time=sc.nextDouble();
 System.out.println("enter the principle");
 time=sc.nextDouble();
 double base = ( 1 + rateofintrest/(number_of_time*100));
 A =principle*Math.pow(base,number_of_time*time);
 System.out.println(A);



    
}
}
