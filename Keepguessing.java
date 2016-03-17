import java.util.Random;
import java.util.Scanner;

public class Keepguessing 
{
    public static void main( String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner( System.in);
        int choice = 1 + r.nextInt(10);
        int entry = keyboard.nextInt();
        
        
        System.out.print(" I have chosen a number between 1 to 10. Try to guess it.");
        while ( choice != entry)
        {
            System.out.print("\n that is incorrect. Guess again");
        System.out.print( "your guess" + entry);
        }
        System.out.println(" thats right! you are a good guesser");
        
         
        
        
    }
     
            
    
}

    

