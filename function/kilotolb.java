package function;
import java.util.Scanner;
public class kilotolb {
   
   public static double kiloToPounds(double kilos) {
     
      return (kilos * 2.204);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double kilos;
      double pounds;
      
      kilos = scnr.nextDouble();
      
      pounds = kiloToPounds(kilos);
      System.out.println(pounds + " lbs");
   }
}

