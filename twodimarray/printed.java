/*Viết chương trình nhập vào một ma trận vuông. In ra chính ma trận vừa nhập

Dữ liệu:

-  Dòng đầu tiên ghi số nguyên không âm n(n<=100).

- n dòng sau, mỗi dòng ghi n số nguyên biểu diễn hàng thứ i của ma trận

Kết quả: In ra chính ma trận vừa nhập*/

package  twodimarray ;
import java.util.Scanner;
public class printed {
    public static void main (String [] args){ 
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int [][]arr = new int [105][105];
        for (int i = 0 ; i < n; i++)
        {
            for(int j= 0 ; j < n; j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        for ( int i= 0 ; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
}
