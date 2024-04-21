package function;
import java.util.Scanner;
public class swapfunc {

   
   public static void swapValues(int[] values)
   {
      int c=values[0];
      values[0]=values[1];
      values[1]=c;
      
      c=values[2];
      values[2]= values[3];
      values[3]=c;
   }
      
   
   public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int [] arr = new int [4];
      //arr[0]=input.nextInt();
      //arr[1]=input.nextInt();
      //arr[2]=input.nextInt();
      //arr[3]=input.nextInt(); next will be the swapValue....
      for ( int i = 0; i <4 ; i++)
      {
         arr [i]= input.nextInt();
      }
      
      swapValues(arr);
      
   
      for ( int i = 0 ; i < 4; i++)
      {
         System.out.print(arr[i]+" ");
      }
      
      
   }
}

