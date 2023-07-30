import java.util.Scanner;
class CollatzProblem{
    // public static int makecycle(int a , int b)
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(n != 1)
        {
            if(n%2==0)
            n=n/2;
            else
            n=3*n+1;
            System.out.print("->"+n);
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}