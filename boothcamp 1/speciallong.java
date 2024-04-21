import java.util.Scanner;

public class speciallong {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      //Part 1 (type your code below each comment line)
      // 1.1.1 Get 1 user input (integer): num1
      num1= scnr.nextInt();
      // 1.1.2 Get 1 user input (integer): num2
      num2= scnr.nextInt();
      // 1.1.3 Get 1 user input (integer): num3
      num3= scnr.nextInt();
      // 1.1.4 Get 1 user input (integer): num4
      num4= scnr.nextInt();
      // 1.2.1 Compute the product: num1*num2*num3*num4
      int product= num1*num2*num3*num4;
      // 1.2.2 Compute the average: (num1+num2+num3+num4)/4 
      int average= (num1+num2+num3+num4)/4;
      // 1.2.3 Print out product and average
      System.out.print(product+" ");
      System.out.println(average);
      
      //Part 2
      double Product= num1*num2*num3*num4;
      double Average= (num1+num2+num3+num4)/4;
      System.out.printf("%.3f ",Product);
      System.out.printf("%.3f\n",Average); -> or System.out.printf("%.3f %.3f\n",Product,Average);
   }
}
