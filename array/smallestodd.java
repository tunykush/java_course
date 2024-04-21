//Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra giá trị lẻ nhỏ nhất trong dãy số

//Dữ liệu:

//Dòng đầu tiên ghi số nguyên không âm n.
//Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
//Kết quả: Đưa ra giá trị lẻ nhỏ nhất của n số nguyên

package array;

import java.util.Scanner;
 
public class smallestodd {
   public static void main (String [] args) {
Scanner input = new Scanner(System.in);
int n= input.nextInt();
int []arr = new int [105];
for ( int i = 1; i <=n ; i++)
{
    arr[i]=input.nextInt();
}
int giatrile=100000001;
for ( int i=1; i <= n; i++)
{
    if ( arr[i]% 2 > 0 && arr[i] < giatrile)
    {
        giatrile = arr[i];
    }
}

System.out.print(giatrile);







   }
}
