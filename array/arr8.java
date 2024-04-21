/*Viết chương trình nhập vào n (0<n<=10^5) số nguyên. Xóa các phần tử chia hết cho 3 của dãy và in ra dãy sau khi xóa.

Dữ liệu:

-  Dòng đầu tiên ghi số nguyên dương n.

-  Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống*/


package array;
import java.util.Scanner;
public class arr8 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []arr = new int[100005];
        for ( int i = 0 ; i < n ; i++)
        {
            arr[i]=input.nextInt();
        }
        for ( int i = 0 ; i < n ; i++)
        {
            if (arr[i]%3 > 0 )
            {
                System.out.print(arr[i]+" ");
            }
        }







    }

}
