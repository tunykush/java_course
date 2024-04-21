//Viết chương trình nhập vào n(0<n<=100) số nguyên. In ra số lượng các số thuộc đoạn [500;3000] trong dãy số

//Dữ liệu:

//Dòng đầu tiên ghi số nguyên không âm n.
//Dòng 2 ghi n số nguyên dương cách nhau một dấu cách trống
//Kết quả: Đưa ra số lượng các số thuộc đoạn [500;3000] trong dãy số



package array;
import java.util.Scanner;
public class numberbeyond {
    public static void main (String [] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int [] arr = new int [105];
for ( int i = 1; i <= n; i++)
{
    arr[i]= input.nextInt();
}
int paperstore = 0;
for (int i=1 ; i <=n ; i++)
{
    if (500<=arr[i] && arr[i]<=3000)
    {
        paperstore ++;
    }
}

System.out.print(paperstore);





    }
    
}
