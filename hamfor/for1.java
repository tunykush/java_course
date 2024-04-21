/*In ra các số từ 1 đến n

Yêu cầu: Nhập vào số nguyên dương n (0<n<1000000). In ra các số nguyên dương từ 1 đến n

Dữ liệu: Một dòng ghi số n duy nhất

 

Kết quả: In ra các số nguyên dương từ 1 đến n, kết thúc bằng dấu !*/
package hamfor;
import java.util.Scanner;
public class for1 {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
for ( int i = 1 ; i <= n ; i++)
{
     System.out.print(i+" ");
}
System.out.print(n+"!");



    }
}
