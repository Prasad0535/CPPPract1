import java.util.*;
import java.util.Scanner;
class Arithematic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        int carry=0,sum=0;
        while(test-- > 0){
            int count=0;
            int m=sc.nextInt();
            int n=sc.nextInt();
            while((m != 0) && (n != 0)){
                sum=(m%10)+(n%10)+carry;
                if(sum > 9){
                    carry=1;
                    count++;
                }
                else{
                    carry=0;
                  //  System.out.println("NO carry Operation");
                   
                }
                 m=m/10;
                    n=n/10;
            }
            System.out.println(count +" "+  "Carry Operation ");
        }
    }
}