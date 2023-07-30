import java.util.Scanner;
public class Trip1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        float sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
            sum+=arr[i];
        }
        float avg=sum/n;
        float mainsum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                mainsum += arr[i]-avg;
            }
        }
        System.out.println(sum);
        System.out.println("Average :"+avg);
        
        
        System.out.println(mainsum);
    }
}
