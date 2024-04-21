/*In ra các dấu #

Yêu cầu: Nhập vào số nguyên dương n (2<n<1000000). In ra 3 hàng dấu #

Dữ liệu: Một dòng ghi số n duy nhất

Kết quả: Dòng 1 ghi n dấu #, dòng 2 ghi n-1 dấu #, dòng 3 ghi n-2 dấu #*/


package hamfor;
import java.util.Scanner;
public class for2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int i = 0 ; i < n ; i++)
        {
            System.out.print("#");
        }
    System.out.println();
        for ( int i = 0 ; i < n-1 ; i++)
        {
            System.out.print("#");
        }
    System.out.println();
        for ( int i = 0 ; i < n-2 ; i++)
        {
            System.out.print("#");
        }
    System.out.println();
        
        

    }
}
