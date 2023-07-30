import java.util.*;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int test=sc.nextInt();
        //while(t-- > 0){
        String a=sc.nextLine();
        String b=sc.nextLine();
        int[] acount1=new int[256];
        int[] bcount1=new int[256];

        for(int i=0;i<a.length();i++){
            acount1[a.charAt(i)]++;
        }
        for(int i=0;i<b.length();i++){
            bcount1[b.charAt(i)]++;
        }
        String longest="";
        for(int i=0;i<256;i++){
            int count=Math.min(acount1[i],bcount1[i]);
            for(int j=0;j<count;j++){
                longest += (char)i;
            }
        }
   
        System.out.println(longest);
     //}
    }
}
