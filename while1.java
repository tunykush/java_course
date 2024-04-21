/*Viết chương trình nhập vào số nguyên n(0<n<=100). In ra n dấu * trên cùng một dòng

Dữ liệu:

- Một dòng ghi số nguyên n(0<n<=100)

Kết quả: Đưa ra n dấu * viết liền nhau*/

import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int n = input.nextInt();
for ( int i = 0 ; i < n ; i++)
{
    System.out.print('*');
}



    }
}
