/*Viết chương trình nhập vào n (0<n<=100) số nguyên và số nguyên X. In ra số lượng các số không nhỏ hơn X trong dãy số đó.

Dữ liệu:

Dòng đầu tiên ghi số nguyên không âm n và số nguyên X.
Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
Kết quả: Đưa ra số các số không nhỏ hơn X trong dãy.*/


package array;
import java.util.Scanner;
public class ar4 {
    public static void main (String [] args){ 
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []arr= new int [105];
int X = input.nextInt();
int count = 0;
for ( int i =0 ; i <n; i++)
{
    arr[i]=input.nextInt();
}
for ( int i=0 ; i<n ; i++)
{
    if (arr[i] >= X)
    {
        count++;
    }
}


System.out.println(count);





    }
}
