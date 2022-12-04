import java.util.*;

public class electricity {
    public static void main(String[] args) {
      double FIXEDBILL = 100;
      double FIXEDBILL0_100 = 6.30;
      double FIXEDBILL101_200 =	6.85;
      double FIXEDBILL_morethan = 7.40;
      double Totalbill=0;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the unit");
      double unit =sc.nextDouble();
      if (unit<=1||unit>=100){
       Totalbill = FIXEDBILL+(unit *FIXEDBILL0_100);
      }
      if(unit >100||unit <200){
        Totalbill=FIXEDBILL+(100*FIXEDBILL0_100)+((unit-100)*FIXEDBILL101_200);
      }
      if(unit>200){
        Totalbill=FIXEDBILL+(100*FIXEDBILL0_100)+(100*FIXEDBILL101_200)+((unit-200)*FIXEDBILL_morethan);
      }
      System.out.println(Totalbill);
    }
    
}