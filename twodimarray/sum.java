/*Viết chương trình nhập vào một ma trận vuông. In ra chính tổng các phần tử trong mảng

Dữ liệu:

-  Dòng đầu tiên ghi số nguyên không âm n(n<=100).

- n dòng sau, mỗi dòng ghi n số nguyên biểu diễn hàng thứ i của ma trận

Kết quả: In ra tổng các phần tử trong mảng*/



package twodimarray;
import java.util.Scanner;
public class sum {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int [][]arr = new int[105][105];
int sum = 0 ;
for ( int i = 0 ; i < n ; i++)
{
    for ( int j = 0; j < n; j++)
    {
        arr[i][j]=input.nextInt();
    }
}
for ( int i= 0 ; i < n; i++)
{
    for ( int j = 0 ; j < n; j++)
    {
        
        sum += arr[i][j];
    }
}
System.out.print(sum);



    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      