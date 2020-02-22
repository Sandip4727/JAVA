import java.util.Scanner;

class Pali2 {

 public static void main(String[] args) {
      int number = 0;

      Scanner input = new Scanner (System.in);	
      System.out.print("Enter a 5-digit number: ");
      number = input.nextInt();
     
      if (number < 99999 && number > 10000)
 {
         int fiveDigits = 0, reverse = 0;
         int temp = number;
    
         while (temp > 0) {
            fiveDigits = temp % 10;
            reverse = (reverse * 10) + fiveDigits;
            temp = temp/10;
         } 
       
         if (number == reverse)
 {
            System.out.println(" Valid 5-digit palindrome.");
         } else
            System.out.println(" Invalid 5-digit palindrome.");
      }
      else
         System.out.println("Invalid 5-digit number. Try Again!");
   }

}
