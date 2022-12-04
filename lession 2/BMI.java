import java.util.Scanner;
public class BMI {

    public static void main(String[] args) {
        float n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        
        n= sc.nextFloat();
        if(n<18.5)
        {
            System.out.print("THIN");
        }
        else if(n>=18.5 && n<25)
        {
           System.out.print("NORMAL");
        } 
        else if(n>=25 && n<30)
        {
            System.out.print("OVERWAIGHT");
        }
        else if(n>30)
        {
            System.out.print("OBASE");
            
        }
        
        
        
        
    }
    
}
