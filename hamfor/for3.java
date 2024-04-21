/*(In ra các dấu $

Yêu cầu: Nhập vào số nguyên dương n (2<n<103). In ra một hình vuông cạnh n gồm các dấu $

Dữ liệu: Một dòng ghi số n duy nhất

Kết quả: một hình vuông gồm n^2 dấu */



package hamfor;
import java.util.Scanner;
public class for3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int i = 0 ; i < n ; i++)
        {
            for ( int j = 0 ; j < n ; j++)
            {
                System.out.print('$');
            }
            System.out.println();
        }
        
    }
    
}
