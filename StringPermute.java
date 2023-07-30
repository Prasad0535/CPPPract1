import java.util.Scanner;

public class StringPermute{
    public static void perMutate(String str, int l, int r){
            //base condition
            if(l==r)
            System.out.println(str+" ");
            else{
        for (int i = l; i <= r; i++){

          // Function to swap
          str=swap(s,l,i);
         // swap(s[l], s[i]);

          // Recursion called
          perMutate(str, l + 1, r);

          //backtrack
          str=swap(s,l,i);
        } 
            }
    }
    private static String swap(String str, int i, int j){
       char[] arr= str.toCharArray();
       char temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The STring : ");
        String str=sc.nextLine();
        int n=str.length();
        System.out.println(perMutate(str, 0, n));
    }
}

/*
 * #include <bits/stdc++.h>
using namespace std;

// Recursive Function
void permute(string s, int l, int r)
{
   // Base case
   if (l == r)
     cout << s << " ";
   else
   {
      for (int i = l; i <= r; i++)
      {

          // Function to swap
          swap(s[l], s[i]);

          // Recursion called
          permute(s, l + 1, r);

          //backtrack
          swap(s[l], s[i]);
        }
    }
}

// Driver Code
int main()
{
    string str;
    cout << "Enter the string: ";
    getline(cin, str);
    int n = str.length();
    permute(str, 0, n - 1);
    return 0;
}
 */