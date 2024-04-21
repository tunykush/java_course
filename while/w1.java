/*Viết chương trình nhập vào số nguyên n(0<n<=100). In ra tổng S= 1^4+2^4+...+n4

Dữ liệu:

- Một dòng ghi số nguyên n(0<n<=100)

Kết quả: Đưa ra tổng S*/



import java.util.Scanner;

public class w1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long s = 0 ;
    
        for ( int i = 1 ; i <= n ; i++)
        {
            s+=i*i*i*i;
        }

    System.out.println(s);    
    }
}
