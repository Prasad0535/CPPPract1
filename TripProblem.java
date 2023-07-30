
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.*;
public class TripProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Students : "  );
        int n=sc.nextInt();
        double Average, taken, given, lastpay, total;
      
      
            double [] money=new double[n];
           
            for(int i=0;i<n;i++)
            {
                money[i]=sc.nextDouble();
            }
             total=0.0;
            for(int i=0;i<n;i++)
            {
               System.out.print(money[i]);
               total += money[i];
           }
System.out.println("Totla of All Member money "+ total);
Average=(double)((total/n)*100.0)/100.0;
System.out.println("Average of all member money "+ Average);
taken=0.0; given=0.0;
for(int i=0;i<n;i++)
{
    if(money[i] > Average){
        given += (double)((money[i]-Average)*100.0)/100.0;
    }
    else {
        taken +=(double)((Average-money[i])*100.0)/100.0;
    
    }
 
}
lastpay=given>taken?given:taken;
System.out.println("Required Payment to Fixed Hisshob : " + lastpay  );
     

    }
}
