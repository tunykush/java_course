/*Cho ba số nguyên dương A , B và C, hãy tính S = A*(B+C)+B*(A+C).

Dữ liệu nhập:

- Là ba số nguyên A, B, C ( 0 < A, B ,C< 109), A và B cách nhau một khoảng trắng.

Dữ liệu xuất:

- Là S = A*(B+C)+B*(A+C).*/



import java.util.Scanner;
public class cal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = a*(b+c)+b*(a+c);
        System.out.print(d);



    }
}
