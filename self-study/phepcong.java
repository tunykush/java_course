import java.util.Scanner;

public class phepcong {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.println("first num:");
        num1 = scnr.nextInt();

        System.out.println("sec num:");
        num2 = scnr.nextInt();

        sum = num1 + num2;
        System.out.println("total: " + sum);

    
    }
}
