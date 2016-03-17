import java.util.Scanner;

public class Pinlockout 
{
    public static void main( String[] args )
    
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        
        System.out.println(" WELCOME TO THE BANK OF MITCHIL");
        System.out.print(" ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;
        int Maxtries = 3;
        
        while ( entry != pin && tries < Maxtries)
        {
            System.out.println( "\nINCORRECT PIN. TRY AGAIN. ");
            System.out.println(" ENTER YOUR PIN");
            entry = keyboard.nextInt();
            tries++;
        }
        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
        else if ( tries >= Maxtries )
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
        
    }  
    
    
}
