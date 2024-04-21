package hamfor;
import java.util.Scanner;
public class for10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char abc = input.next().charAt(0);
        for ( int i = 0 ; i < n ; i++)
        {
            for ( int j = 0 ; j <m  ; j++){
                System.out.print(abc);
            }
            System.out.println();
        }
    }
    
}
