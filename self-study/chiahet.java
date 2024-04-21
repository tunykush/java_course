//Viết chương trình nhập vào một số và kiểm tra xem số đó có chia hết cho 5 hay không?


import java.util.Scanner;
public class chiahet {
    public static void main(String[] args) {
        Scanner subject = new Scanner(System.in);
        System.out.println("nhap so n");
        int n = subject.nextInt();
        if (n%5==0)
        {
            System.out.println(n+"this number divided by 5");
        }
        else {
            System.out.println(n+"this number couldnt divide by 5");
        }
        subject.close();    
    }
}
