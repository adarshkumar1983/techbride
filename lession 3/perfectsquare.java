
import java.util.Scanner;

public class perfectsquare
{
 public static void main(String[] args)  
{  
  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter  number: ");  

int number = sc.nextInt();   
 
double x = Math.sqrt(number);   
 
if(x == (int)x)  
{  
System.out.println(number+" is a perfect square.");  
}  
else  
{  
System.out.println(number+" is not a perfect square.");  
}  
}  
} 
     
