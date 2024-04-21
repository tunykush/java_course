/*n!! = 1 x 3 x 5 x 7
n le*/


package hamfor;
import java.util.Scanner;
public class giaithuakep {
    public static void main ( String[]args ){
Scanner input = new Scanner(System.in);

int n = input.nextInt();
if ( n%2 == 0 )
{
    System.out.print("ERROR");
    return;
}

long gtk = 1;
for ( int i = 0 ; i <= n ; i++)
{
    if ( i%2 > 0)
    {
        gtk = ( gtk*i)%1000000007;
    }
}
System.out.println(gtk);


    }




}