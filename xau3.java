/*Viết chương trình làm hoa các ký tự trong xâu S cho trước

Dữ liệu nhập:

- Một dòng là chuỗi kí tự S có độ dài nhỏ hơn 1000 ký tự bao gồm các ký tự la tinh thường và hoa ;

Dữ liệu xuất:

- Là xâu S sau khi đã được làm hoa các ký tự;*/


import java.util.Scanner;
public class xau3 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String s = input.next();
for ( int i = 0 ; i < s.length() ; i++)
{
    if (s.charAt(i) >= 97 && s.charAt(i) <= 122 )
    {
        System.out.print((char)(s.charAt(i)-32));
    } else {
        System.out.print(s.charAt((i)));
    }
}

String supper="";
for ( int i = 0 ; i < s.length() ; i++)
{
    if (s.charAt(i) >= 97 && s.charAt(i) <= 122 )
    {
        supper+=s.charAt(i)-32;
    } else {
        supper+=s.charAt((i));
    }
}

print(supper);







    }
    
}
