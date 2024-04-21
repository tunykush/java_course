/*Đếm số dãy nhị phân có độ dài n

Yêu cầu: Nhập vào số nguyên dương n (2<n<50). In ra số dãy nhị phân độ dài n

Chẳng hạn với n = 2 ta có các dãy nhị phân là 00, 01, 10 ,11

Với n = 3 ta có các dãy nhị phân 000, 001, 010, 011, 100, 101, 110, 111

Dữ liệu: Một dòng ghi số n duy nhất

Kết quả: Ghi ra số lượng dãy nhị phân độ dài n*/

package hamfor;
import java.util.Scanner;
public class for6{
public static void main ( String []args){
   Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   long  binary = 1;
   for ( int i = 0; i < n ; i++)
   {
      binary = binary*2;
   
      }
   System.out.println(binary);
}
}

