//Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra giá trị nhỏ nhất

//Dữ liệu:

//Dòng đầu tiên ghi số nguyên không âm n.
//Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
//Kết quả: Đưa ra giá trị nhỏ nhất  của n số nguyên

package array;
import java.util.Scanner;
public class min {
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int [] a = new int [105];
        int n = input.nextInt();
        for (int i=1; i<=n; i++ )
        {
            a[i]=input.nextInt();
        }
        int paper = a[1];
        for ( int i=2; i <= n; i++)
        {
          if   ( paper > a[i] )
            {
                paper = a[i] ;   
            }

        }
        System.out.print(paper);
        
        




    }

}

