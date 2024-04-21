import java.util.Scanner;

public class ngaythangnam {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String str;
      for(;;) {
         str=scnr.nextLine();
         if(str.equals("-1")) break;
         
         String month="";
         boolean gotMonth=false;
         
         int i;
         
         for(i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ') {
               gotMonth=true;
               break;
            } else {
               month+=str.charAt(i);  
            }
         }
         
         if(!gotMonth) {
            continue;
         }
         
         int monthInt=getMonthAsInt(month);
         
         if(monthInt==0) {
            continue;
         }
         
         i++;
         
         boolean gotDay=false;
         int day=0;
         
         for(; i<str.length(); i++) {
            if(str.charAt(i)==',') {
               gotDay=true;
               break;
            } else {
               day=day*10+(int)str.charAt(i)-48;
            }
         }
         
         if(!gotDay) {
            continue;  
         }
         
         i+=2;
         boolean gotYear=true;
         int year=0;
         for(; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
               year=year*10+(int)str.charAt(i)-48;
            } else {
               gotYear=false;
               break;
            }
         }
         
         if(!gotYear) continue;
         
         System.out.printf("%d-%d-%d\n",monthInt,day,year);
      }

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m-d-yyyy format
     
   }
}
