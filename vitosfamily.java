import java.util.*;
public class vitosfamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total test cases :");
       int t = sc.nextInt();
        while (t-- > 0) {
        System.out.println("the number of family members :");

           int n = sc.nextInt();
            ArrayList<Integer> heights = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
        System.out.println("the number of family members heights :");

                int height = sc.nextInt();
                heights.add(height);
            }
            int sum = 0;
            Collections.sort(heights);
            int median = heights.get(heights.size() / 2);
            for (int height : heights) {
                sum += Math.abs(height - median);
            }
            System.out.println("total :"+sum);
        }
    }
}

        // Scanner sc = new Scanner(System.in);
        // int t=sc.nextInt();
        // while(t-- > 0){
        //     int n=sc.nextInt();
        //     ArrayList<Integer>height=new ArrayList<>();
        //     int sum=0;
        //     while(n-- > 0){
        //         int v=sc.nextInt();
        //         height.add(v);
        //     }
        //     Collections.sort(height);
        //     int median=height.get(height.size()/2);
        //     for(int v : height)
        //     sum += Math.abs(v-median);
        //     System.out.println(sum);
        // }
