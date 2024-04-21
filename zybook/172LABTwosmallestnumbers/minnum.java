/*Write a program that reads a list of integers, 
and outputs the two smallest integers in the list, in ascending order. 
The input begins with an integer indicating the number of integers that follow. 
You can assume that the list will have at least 2 integers and fewer than 20 integers.

Ex: 
If the input is:
5
10 5 3 21 2



the output is:
2 and 3*/




package zybook.17.2 LAB Two smallest numbers;
import java.util.Scanner;
public class minnum {
   

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   
   int []a= new int[26];
   
   for ( int i = 0 ; i < n ; i++){
      a[i]=input.nextInt();
   }
   for ( int i = 0 ; i < n-1; i++){
      for ( int j = 0 ; j < n-1-i;j++){
         if(a[j] > a[j+1]){
         int tmp =a[j];
         a[j]= a[j+1];
         a[j+1]=tmp;
         }
      }
   }
   System.out.println(a[0]+" and " +a[1]);
   
   }
}

}
