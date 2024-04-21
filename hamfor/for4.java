/*In ra tam giác vuông cân các số 0

Yêu cầu: Nhập vào số nguyên dương n (2<n<103). In ra một tam giác vuông cân cạnh n gồm các số 0

Dữ liệu: Một dòng ghi số n duy nhất

Kết quả: 

- Dòng 1 ghi 1 số 0

- Dòng 2 ghi 2 số 0

- Dòng thứ i ghi i số 0*/


package hamfor;
import java.util.Scanner;
public class for4 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1 ; i <= n ; i++)
        {
            for ( int j = 1 ; j <= i ; j++)
            {
                System.out.print("0");
            }
            System.out.println();
        }




    }
}
