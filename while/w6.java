/*Viết chương trình nhập vào số nguyên n(0<n<=103). In ra tam giác vuông chỉ toàn dấu @

Dữ liệu:

- Một dòng ghi số nguyên n(0<n<=103)

Kết quả: Đưa ra tam giác vuông gồm các dấu @ với cạnh đáy có n dấu @
*/


import java.util.Scanner;

public class w6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int i = n ; i >= 1 ; i--)
        {
            for ( int j = i ; j > 0 ; j--)
            {
                System.out.print('@');
            }
            System.out.println();
        }

    }
    
}
