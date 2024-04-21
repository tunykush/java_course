/*Một số a được gọi là chính phương nếu tồn tại số nguyên b thỏa mãn b2=a. Ta có thể sử dụng một số lệnh để kiểm tra một số có chính phương hay không như sau:

c=int(sqrt(a));
if(c*c==a) <a là chính phương>;
else <a không là chính phương>;
Viết chương trình nhập vào n (0<n<=100) số nguyên. In ra số lượng các số chính phương trong dãy.

Dữ liệu:

Dòng đầu tiên ghi số nguyên dương n.
Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
Kết quả: Đưa ra số lượng các số chính phương trong dãy.*/



package array;
import java.util.Scanner;
public class ar5 {
    public static void main (String [] args){ 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []arr= new int[105];
        int count = 0;
        for ( int i = 0; i < n ; i++)
        {
            arr[i]=input.nextInt();
        }
        for ( int i = 0 ; i < n ; i++)
        {
            int b = ( int )Math.sqrt (arr[i]);
            if ( b*b == arr[i])
            {
                count++;
            }
        }

System.out.println(count);

    }
    
}
