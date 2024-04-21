/*Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra tổng của n số nguyên đó.

Dữ liệu:

Dòng đầu tiên ghi số nguyên không âm n.
Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
Kết quả: Đưa ra tổng của n số nguyên*/


package array;



import java.util.Scanner;
public class ar1 {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []arr= new int [105];
int sum = 0;
for ( int i = 0 ; i < n ; i++)
{
    arr[i]= input.nextInt();
}
for ( int i = 0 ; i < n ; i++)
{
    sum += arr[i];
}
System.out.print(sum);

    }
    
}
