//Write a program with total change amount in pennies as an integer input, 
//and output the change using the fewest coins, one coin type per line. 
//The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. 
//Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.


import java.util.Scanner; 

public class chargemoney {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int cent = input.nextInt();
      if( cent == 0 )
      { 
         System.out.println("No change");
      }
      else
      
      {
      int dollar = cent/100;
      cent = cent%100;
      int quarter = cent/25;
      cent= cent%25;
      int dime = cent/10;
      cent = cent%10;
      int nickel = cent/5;
      cent = cent%5;
      /////////////////////////
      if( dollar == 1 )
      {
         System.out.println("1 Dollar");
      }
      else if ( dollar > 1)
      {
         System.out.println(dollar+" Dollars");
      }
      ////////////////
      if( quarter == 1 )
      {
         System.out.println("1 Quarter");
      }
      else if ( quarter > 1)
      {
         System.out.println(quarter+" Quarters");
      }
      //////////
      if( dime == 1 )
      {
         System.out.println("1 Dime");
      }
      else if ( dime > 1)
      {
         System.out.println(dime+" Dimes");
      }
      ////////////////////
      if( nickel == 1 )
      {
         System.out.println("1 Nickel");
      }
      else if ( nickel > 1)
      {
         System.out.println(nickel+" Nickels");
      }
      ///////////////
      int penny = cent;
      if ( penny == 1 )
      {
         System.out.println("1 Penny");
      }
      else if ( penny >1 )
      {
         System.out.println(penny+" Pennies");
      }
      
      }
      
      
      
      
      
   }
}
