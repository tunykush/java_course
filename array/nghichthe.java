/*Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra số lượng các cặp a[i] và a[j] thỏa mãn i<j và a[i]>a[j] trong dãy số.

Dữ liệu:

Dòng đầu tiên ghi số nguyên không âm n.
Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống*/


package array;
import java.util.Scanner;
public class nghichthe {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int []arr = new int [105];
    int count = 0;
    for ( int i = 0; i < n ; i++)
    {
        arr[i]=input.nextInt();
    }
    for ( int i = 0; i < n; i++)
    {
        for ( int j = i+1; j< n; j++)
        {
            if (arr[i]>arr[j] )
            {
                count++; 
            }
            
        }
    }
    System.out.print(count);
    }
}
