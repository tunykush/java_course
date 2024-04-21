import java.util.Scanner;

public class amountofmoney {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("You are out with a bunch of friends and just an expensive dinner of...[enter a large amount]");
      System.out.println("and you just realized you lost your phone and wallet to pay");
      System.out.println("How many friends are with you? So we can split the money borrowed")  ;    
      int friends = scnr.nextInt();
      int amount = scnr.nextInt();
      int split = amount/friends;
      System.out.println("You have to borrow "+split+"AUD from each of your friends!");
      
   }
}
   /*if enter a large amount
   it should be                         double friends = scnr.nextDouble();
                                        double amount = scnr.nextDouble();
                                        double split = amount/friends;*/