/*Viết chương trình nhập vào số nguyên n(0<n<=106). In ra tổng S= 1^3+2^3+...+n^3

Dữ liệu:

- Một dòng ghi số nguyên n(0<n<=106)

Kết quả: Đưa ra tổng S chia lấy dư cho 1000000007
*/


import java.util.Scanner;
public class w3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            long s = 0;
            for ( long i = 1 ; i <= n ; i++)
            {
                   s=(s+ i*i*i%1000000007 )%1000000007;
            }
        System.out.println(s);

    }

}
