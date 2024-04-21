import java.util.Scanner;

public class kmtomtocmtomm {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please enter kilometres, metres, centimetres, and millimetres on a single line:");
      int Kmnumb = scnr.nextInt();
      int Mnumb = scnr.nextInt();
      int Cmnumb = scnr.nextInt();
      int Mmnumb = scnr.nextInt();
      int Resultnum = Kmnumb * 1000000 + Mmnumb + Mnumb * 1000 + Cmnumb * 10;
      System.out.println("Total millimetres: "+ Resultnum);
      
     
   }
}