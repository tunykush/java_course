package hamfor;
import java.util.Scanner;
public class for8 {
    public static void main ( String[]args){
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []u = new int[1000005];
u[1]=1;
u[2]=1;
for ( int i = 3 ; i<= n ; i++)
{
    u[i]=3*u[i-1]-u[i-2];
}

System.out.print(u[n]);

    }
    
}
