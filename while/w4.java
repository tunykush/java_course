/*Viết chương trình nhập vào số nguyên n(0<n<=103). In ra hình vuông nxn các dấu $

Dữ liệu:

- Một dòng ghi số nguyên n(0<n<=106)

Kết quả: Đưa ra hình vuông nxn các dấu $*/



import java.util.Scanner;
public class w4 {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for ( int i = 0 ; i < n ; i++)
    {
        for(int j=0; j<n; j++) {
            System.out.print('$');
        }

        System.out.println();
    }
    }
}
