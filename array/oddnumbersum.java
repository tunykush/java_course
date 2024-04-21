//Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra tổng các số lẻ

//Dữ liệu:

//Dòng đầu tiên ghi số nguyên không âm n.
//Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống


package array;
import java.util.Scanner;
public class oddnumbersum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []arr = new int [105];
        for (int i=1; i <= n; i++)
        {
            arr[i]=input.nextInt();
        }
        int papertotal= 0;
        for ( int i= 1; i <= n; i ++)
        {
            if ( arr[i]%2 > 0 )
            {
                papertotal += arr[i];
            }
        }
            System.out.print(papertotal);
    }
}
