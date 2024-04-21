package array;

import java.util.Scanner;
 
public class tong {
   public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);

        long[] a=new long[100005];

        int n=sc.nextInt();
        for(int i=1; i<=n; i++) {
            a[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        long s=0;

        for(int i=1; i<=k; i++) {
            s+=a[i];
        }

        System.out.print(s);






   }
}