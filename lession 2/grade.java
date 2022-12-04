import java.util.Scanner;
public class grade {
    
    public static void main(String[] args) {
        double marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        marks=sc.nextDouble(); 
        if(marks>=90){
            System.out.println("A");
        }
        if(marks>=80&&marks<89){
            System.out.println("B");
        }
        if(marks>=70&&marks<79){
            System.out.println("c");
        }
        if(marks>=60&&marks<69){
            System.out.println("D");

        }
        if(marks>=50&&marks<59){
            System.out.println("E");
        }
        if(marks<=50){
            System.out.println("F");
        }
    }
}
