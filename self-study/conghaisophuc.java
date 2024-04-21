
//khai báo phần thực z1, phần ảo z1, phần thực z2, phần ảo z2
//rồi nhập 4 cái đấy vào
//phần thực của kết quả = thực z1+thực z2;
//tương tự vs phần ảo của kq
//rồi print 2 cái kia của kết quả ra tho


import java.util.Scanner;

public class conghaisophuc {
    public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

System.out.println("Enter z1");
double zOne = scnr.nextDouble();

System.out.println("Enter fake z1");
double zOnefake = scnr.nextDouble();

System.out.println("Enter z2");
double zTwo = scnr.nextDouble();

System.out.println("Enter fake z2");
double zTwofake = scnr.nextDouble();

double Result = zOne + zTwo ;
System.out.println("total of real numb" +Result);

Double fakeResult = zOnefake + zTwofake;
System.out.println("total of fake numb" +fakeResult);
    }
}
