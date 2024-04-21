/*Viết chương trình đếm số ký tự Ch xuất hiện trong xâu S

Dữ liệu nhập:

- Dòng 1 là chuỗi kí tự S có độ dài nhỏ 100 ký tự ;

- Dòng 2 là ký tự Ch;

Dữ liệu xuất:

- Là số lượng ký tự Ch trong xâu S*/

import java.util.Scanner;
public class xau2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char zzz = input.next().charAt(0);
        int count = 0;
        for ( int i = 0 ; i < s.length(); i++)
        {
            if ( s.charAt(i)==zzz)
            {
                count++;
            }
        }
System.out.print(count);

    }
}
