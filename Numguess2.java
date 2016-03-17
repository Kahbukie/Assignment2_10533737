import java.util.Random;
import java.util.Scanner;


public class Numguess2
{
    public static void main( String[] args)
    {
        Random r = new Random();
        
        int choice = 1 + r. nextInt(10);
        String response= "";
        //Scanner keyboard = new Scanner( System.in);
        //int entry = keyboard.nextInt();
         
        System.out.println("I have chosen a number between 1 to 10. Try to guess it");
        
        Scanner keyboard = new Scanner( System.in);
        int entry = keyboard.nextInt();
        System.out.println("YOUR GUESS:" + entry);
        
        while (choice != entry)
        {
            System.out.println(" That is incorrect. Guess again");
           // System.out.println( entry);
          entry = keyboard.nextInt();
        }
    }
    

}
    
       

