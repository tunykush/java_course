/*Giai thừa

Yêu cầu: Nhập vào số nguyên dương n (2<n<103). In ra n! chia lấy dư cho 1000000007

Dữ liệu: Một dòng ghi số n duy nhất

Kết quả: Ghi ra n! %1000000007*/


package hamfor;
import java.util.Scanner;
public class for5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        long giaithua = 1 ;
        for ( int i = 1 ; i <= n ; i++)
        {
            giaithua =(giaithua*i)%1000000007;
        }
        System.out.print(giaithua);
    }

    
}
