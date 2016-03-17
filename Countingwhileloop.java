import java.util.Scanner;

public class Countingwhileloop
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in);
        
        System.out.println(" type in a message and i will dispaly it several times");
        System.out.print( "message :");
        String message = keyboard.nextLine();
        
        System.out.print(" \nHow many times:" );
        int enter = keyboard.nextInt();
        
        System.out.print(enter);
        
        
        int n = 0;
        while ( n < enter)
        {
            System.out.println( ((n+1) * (10)) + " " + message);
            n++;
        }
    }
    
}
