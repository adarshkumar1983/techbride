
import java.util.Scanner;
 import java.math.*;
public class sunny
{
 public static void main(String[] args)  
{  
  int y ;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  

int number = sc.nextInt();
y= (number + 1);
 
double x = Math.sqrt(y);   
 
if(x == (int)x)  
{  
System.out.println(number+" is a sunny number .");  
}  
else  
{  
System.out.println(number+" is not a sunny number .");  
}  
}  
} 
     
