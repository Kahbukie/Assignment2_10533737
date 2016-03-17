import java.util.Random;
import java.util.Scanner;


public class Numberguessing 
{
    public static void main( String[] args )
    {
        Random r = new Random();
        
        int choice = 1 + r. nextInt(10);
        String response= "";
        //Scanner keyboard = new Scanner( System.in);
        //int entry = keyboard.nextInt();
         
        System.out.println("I'm thinking of a number from 1 to 10");
        Scanner keyboard = new Scanner( System.in);
        int entry = keyboard.nextInt();
        System.out.println("YOUR GUESS:" + entry);
        if ( choice != entry)
                response=" Sorry, but i was really thinking of " + choice;
               
                //else if ( choice == 4)
                    //response=" sorry but i was really tinking of 7";
                else if ( choice == entry)
                    response="That's right! My secret number was" + choice;
                            
                
                
                else response =" you cant guess twice";
        System.out.print ( response);
               
                
    }
        
            
    
}
