import java.util.Scanner;

public class countNonRepeatingElement {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.

        int i=0;
       for(int j=1; j<n; j++)
       {
           if(arr[i]!=arr[j])
           {
                 i++;
               arr[i]=arr[j];
              
           }
       }
        return i+1;
    }

public static void main(String []args)  {

    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++)
    {
        arr[i]=s.nextInt();
    }

    System.out.println(removeDuplicates(arr, n));
    }
}