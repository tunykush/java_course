import java.util.Scanner;
public class printchar{
    public static void main(String[] args){
       
       
      char a,b,c,d,e;
      Scanner inp= new Scanner(System.in);
      System.out.println("Prompt the user to input the first character:");
      a= inp.next().charAt(0);
      System.out.println("Prompt the user to input the second character:");
      b= inp.next().charAt(0);
      System.out.println("Prompt the user to input the third character:");
      c= inp.next().charAt(0);
      System.out.println("Prompt the user to input the fourth character:");
      d= inp.next().charAt(0);
      System.out.println("Prompt the user to input the fifth character:");
      e= inp.next().charAt(0);
      
      String Resultword = "";
      System.out.println();
      Resultword = Resultword + a + b + c + d + e ;
      System.out.println("Answer:"+ Resultword);
      System.out.println();
      System.out.println("Please enter a single word consisting of exactly five characters:");
      
      System.out.println();
      String f= inp.next();
      System.out.println("Answer:");
      System.out.println(f.charAt(0));
      System.out.println(f.charAt(1));
      System.out.println(f.charAt(2));
      System.out.println(f.charAt(3));
      System.out.print(f.charAt(4));
    }
}