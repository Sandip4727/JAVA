/*(square of Asterisks)Write an application that prompts 
the user to enter the size of the side of a square,then 
displays a hollow square of that size made of asterisks.
Your program should work from square of all side length 
betwween 1 and 20*/
import java.util.*;
 
 public class seq{
   public static void main(String s[])
   {
     Scanner scanner=new Scanner(System.in);
     int userInteger;
     
     System.out.println("please enter a number between 1 to 20");
     userInteger=scanner.nextInt();
     
     while(userInteger<1 || userInteger>20)
     {
       System.out.println("please enter a vaild number");
       userInteger=scanner.nextInt();
     }
    
          int i, j; 
        for (i = 1; i <= userInteger; i++) 
        { 
            // Print stars for each solid rows 
            if (i == 1 || i == userInteger) 
                for (j = 1; j <= userInteger; j++) 
                    System.out.print("*"); 
      
            // stars for hollow rows 
            else
                for (j = 1; j <= userInteger; j++) 
                    if (j == 1 || j == userInteger) 
                        System.out.print("*"); 
                    else
                        System.out.print(" "); 
      
            // Move to the next line/row 
            System.out.print("\n"); 
        } 
      }
    }
