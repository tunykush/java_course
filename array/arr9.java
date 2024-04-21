/*Viết chương trình nhập vào n (0<n<=105) số nguyên. Xóa các phần tử chia hết cho 3 của dãy và in ra dãy sau khi xóa. Sau đó lại xóa các phần tử chia hết cho 5 trong dãy còn lại và in ra dãy

Dữ liệu:

-  Dòng đầu tiên ghi số nguyên dương n.

-  Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống

Kết quả:

-  Dòng đầu tiên ghi dãy sau khi xóa đi các phần tử chia hết cho 3

- Dòng thứ hai ghi dãy sau khi xóa hết các phần tử chia hết cho cả 3 và 5*/


package array;
import java.util.Scanner;
public class arr9 {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []arr = new int[105];
for ( int i = 0 ; i < n ; i++)
{
    arr[i]=input.nextInt();
}
for ( int i =0 ; i < n ; i++)
{
    if ( arr[i]%3 != 0 )
    {
        System.out.print(arr[i]+" ");
    }
}
System.out.println();
for ( int i = 0 ; i < n ; i++)
{
    if ( arr[i]%5 > 0 && arr[i]% 3 > 0 )
    {
        System.out.print(arr[i]+" ");
    }
}





    }
    
}
