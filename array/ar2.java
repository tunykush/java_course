/*Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra giá trị lớn nhất của n số nguyên đó.

Dữ liệu:

- Dòng đầu tiên ghi số nguyên không âm n.

- Dòng 2 ghi n số nguyên cách nhau một dấu cách trống

Kết quả: Đưa ra giá trị lớn nhất của n số nguyên đó.*/


package array;
import java.util.Scanner;
public class ar2 {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []arr = new int [105];
int max = 0;
for ( int i= 0 ; i <n ; i++)
{
    arr[i]= input.nextInt();
}
for (int i = 0; i < n; i++)
{
    if ( arr[i] > max ) {
        max = arr[i];
    }
}
System.out.println(max);
}

    }

