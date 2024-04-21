/*Viết chương trình nhập vào n số nguyên a1, a2,...,an. Thoát khỏi chương trình khi gặp một số âm và ghi ra số dương cuối cùng trước khi gặp số âm.

Dữ liệu:

- Dòng 1 ghi số nguyên dương n(0<n<=106)

- Dòng thứ hai ghi các số nguyên a1, a2,...,an kiểu 64 - bit

Kết quả: Đưa ra số dương cuối cùng trước số âm đầu tiên của dãy*/


import java.util.Scanner;
public class w7 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long []arr= new long [1000005];
        for ( int i = 0 ; i < n ; i++){
            arr[i]=input.nextLong();
        }
        long po=0;
        for (int i = 0 ; i< n; i++){
            if (arr[i]>0)
            {
                po=arr[i];
            }
            else if (arr[i]< 0)
            {
                System.out.print(po);
                return;
            }
        }
    }
}
